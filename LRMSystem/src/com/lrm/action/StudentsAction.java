package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Student;
import com.lrm.service.StudentsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 学生Action类
 * @author zhuguangjin
 *
 */

@Scope("prototype")
@Controller("StudentsAction")
public class StudentsAction extends BaseAction implements ModelDriven<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private StudentsService studentsService;

	private Student student = new Student();
	
	public String studentLogin() {
		
		return "studentLogin";
	}
	

	/**
	 * @brief 查询所有学生
	 * @return
	 */
	public String studentListUI() {
		List<Student> studentList = studentsService.studentFindAll();
		session.setAttribute("studentList", studentList);
		//ActionContext.getContext().put("studentList", studentList);
		return "studentListUI";
	}

	/**
	 * @brief 按学号查询
	 * @return
	 */
	public String studentQueryByNumber() {
		String num = request.getParameter("studentNumber");
		System.out.println("学生的学号"+num);
		List<Student> studentList = studentsService.getStudentByNumber(num);
		//ActionContext.getContext().put("studentList", studentList);
		session.setAttribute("studentList", studentList);
		return "toStudentListUI";
	}

	/**
	 * @brief 按班级查询
	 * @return
	 */
	public String studentQueryByClass() {

		String className = request.getParameter("soclassName");
		List<Student> studentList = studentsService.getStudentByClassName(className);
		//ActionContext.getContext().put("studentList", studentList);
		session.setAttribute("studentList", studentList);
		return "toStudentListUI";
	}

	/**
	 * @brief 按专业查询
	 * @return
	 */
	public String studentQueryByMajor() {
		String studentMajor = request.getParameter("soclassMajor");
		List<Student> studentList = studentsService.getStudentByMajor(studentMajor);
		ActionContext.getContext().put("studentList", studentList);
		return "toStudentListUI";
	}

	/**
	 * @brief 删除学生用户
	 * @return
	 */
	public String studentDelete() {
		//System.out.println("学生ID"+student.getStudentId());
		studentsService.studentDeleteById(student.getStudentId());
		return "toStudentList";
	}
	
	/**
	 * @brief 添加学生页面
	 * @return
	 */
	public String studentAddUI() {	
		return "studentAddUI";
	}
	
	/**
	 * @brief 添加学生
	 * @return
	 */
	public String studentAdd() {
		String sclsId = request.getParameter("schoolClass。soclassId");
		long clId = Long.valueOf(sclsId);
		studentsService.studentAdd(student, clId);
		return "toStudentList";
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	public StudentsService getStudentsService() {
		return studentsService;
	}

	public void setStudentsService(StudentsService studentsService) {
		this.studentsService = studentsService;
	}

}
