package com.lrm.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.ReserveInfo;
import com.lrm.entity.ReserveSerchInfo;
import com.lrm.entity.Teacher;
import com.lrm.service.TeacherService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 老师Action类
 * @author zhuguangjin
 *
 */
@Scope("prototype")
@Controller("TeacherAction")
public class TeacherAction extends BaseAction implements ModelDriven<Teacher> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private TeacherService teacherService;

	Teacher teacher = new Teacher();

	/**
	 * @brief 老师用户登录
	 * @return
	 */
	public String teacherLogin() {
		System.out.println("(用户登录)老师用户名" + teacher.getTeacherUsername() + "老师密码" + teacher.getTeacherPassword() + "老师ID"
				+ teacher.getTeacherId());
		Teacher tlogin = teacherService.teacherLogin(teacher.getTeacherUsername(), teacher.getTeacherPassword());
		if (tlogin != null) {
			session.setAttribute("teacherNmae", tlogin.getTeacherUsername());
			session.setAttribute("tlogin", tlogin);
			return "teacherLogin";
		}
		return "toUserLogin";
	}

	/**
	 * @brief 老师个人信息页面
	 * @return
	 */
	public String teacherInfoUI() {
		return "teacherInfoUI";
	}

	/**
	 * @brief 老师修改界面
	 * @return
	 */
	public String teacherEditUI() {
		return "teacherEditUI";
	}

	/**
	 * @brief 老师信息修改
	 * @return
	 */
	public String teacherEdit() {
		// Teacher tea = teacherService.getTeacherById(teacher.getTeacherId());
		Teacher teaUpdateInfo;
		System.out.println("(个人信息修改)老师ID" + teacher.getTeacherId());
		Teacher editTeacher = teacherService.getTeacherById(teacher.getTeacherId());
		if (editTeacher != null) {
			editTeacher.setTeacherUsername(teacher.getTeacherUsername());
			editTeacher.setTeacherPassword(teacher.getTeacherPassword());
			editTeacher.setTeacherNumber(teacher.getTeacherNumber());
			editTeacher.setTeacherPhoneNum(teacher.getTeacherPhoneNum());
			editTeacher.setTeacherEmail(teacher.getTeacherEmail());

			teacherService.updateTeacherInfo(editTeacher);
			teaUpdateInfo = editTeacher;
			session.setAttribute("tlogin", teaUpdateInfo);
			return "toTeacherInfoUI";
		}
		return "";
	}

	/**
	 * @brief 实验室预约页面
	 * @return
	 */
	public String teacherReserveLabUI() {
		return "teacherReserveLabUI";
	}

	/**
	 * @brief 实验室可预约列表
	 * @return
	 */

	public String teacherReserveSearch() {
		// 获取查询信息
		String soclassName = request.getParameter("soclassName");
		String labName = request.getParameter("labName");
		String courseTime = request.getParameter("courseTime");
		String labTime = request.getParameter("labTime");
		Teacher tea = (Teacher) session.getAttribute("tlogin");
		long teacherId = tea.getTeacherId();
		String week = "";
		System.out.println("(预约查询)查询信息" + soclassName + labName + courseTime + labTime + teacherId);

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 字符串格式转化为日期格式并获取星期数
		try {
			Date new_time = df.parse(labTime);
			SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
			week = sdf.format(new_time);
			System.out.println("星期数" + week);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// 初始化查询条件
		ReserveSerchInfo serchInfo = new ReserveSerchInfo(soclassName, labName, courseTime, labTime, week);

		// 执行查询并返回结果
		ReserveInfo revLabList = teacherService.getReserveInfoList(serchInfo, teacherId);
		session.setAttribute("revLabList", revLabList);
		return "teaReserveLabList";
	}

	/**
	 * @brief 老师列表显示
	 * @return
	 */
	public String teacherListUI() {
		List<Teacher> teacherList = teacherService.teacherFindAll();
		session.setAttribute("teacherList", teacherList);
		return "teacherList";
	}

	/**
	 * @brief 老师用户添加页面
	 * @return
	 */
	public String teacherAddUI() {
		return "teacherAddUI";
	}

	/**
	 * @brief 老师用户添加
	 * @return
	 */
	public String teacherAdd() {
		teacherService.teacherAdd(teacher);
		return "toTeacherList";
	}

	/**
	 * @brief 老师用户删除
	 * @return
	 */
	public String teacherDelete() {
		teacherService.teacherDeleteById(teacher.getTeacherId());
		return "toTeacherList";
	}

	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return teacher;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
