package com.lrm.action;


import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;


import javax.annotation.Resource;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Student;
import com.lrm.entity.Teacher;
import com.lrm.entity.TeacherTimeTable;
import com.lrm.service.TeacherTimeTableService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 老师课表Action类
 * @author zhuguangjin
 *
 */
@Scope("prototype")
@Controller("TeacherTimeTableAction")
public class TeacherTimeTableAction extends BaseAction implements ModelDriven<TeacherTimeTable> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	TeacherTimeTable teaTimeTable = new TeacherTimeTable();

	@Resource
	private TeacherTimeTableService teaTimeTableService;

	/**
	 * @brief 老师课表显示Action
	 * @return
	 */
	public String showTeacherTimeTable() {
		int i = 0, j = 0;
		long teaId = 0;
		Teacher tea= null;
		tea = (Teacher)session.getAttribute("tlogin");
		if(tea != null)
		{
			teaId = tea.getTeacherId();
			System.out.println(teaId);
		}
		TeacherTimeTable[][] teaTableShow = teaTimeTableService.getTeaTimeTableByTeaId(teaId);
		while (i < 4) {
			while (j < 6) {
				if (teaTableShow[i][j] != null) {
					String showstr = teaTableShow[i][j].getTeaTableCourse().getCourseName();
					String showstrweek = teaTableShow[i][j].getTeaCourseWeek();
					System.out.println("(老师课表显示)课程名称显示" + "位置为："+"("+i+","+j+")"+showstr+"__"+showstrweek);					
				}
				j=j+1;
			}
			j=0;
			i=i+1;
		}
		session.setAttribute("teaTableShow", teaTableShow);
		return "showTeacherTimeTable";
	}

	/**
	 * @brief 获取老师所授课的班级
	 * @return
	 */
	public String getClassListFromTable() {
		Teacher tea = null;
		tea = (Teacher)session.getAttribute("tlogin");
		System.out.println("(按老师ID获取班级)老师ID"+tea.getTeacherId());
		List<TeacherTimeTable> teaTableClassList = teaTimeTableService.getTeaClassListByTid(tea.getTeacherId());				
		session.setAttribute("teaTableClassList", teaTableClassList);
		return "classListFromTable";
	}
	
	/**
	 * @brief 对应班级的学生列表
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String getClassStudentListByName() throws UnsupportedEncodingException {
		//重新转码
		String _clName = teaTimeTable.getTeaSchoolClass().getSoclassName();
		_clName = new String(_clName.getBytes("iso-8859-1"),"utf-8");
		System.out.println("老师对应班级名称"+_clName);
		List<Student> teaclStudentList = teaTimeTableService.getTeaClStudentByCname(_clName);
		Iterator<Student> ite = teaclStudentList.iterator();
		while(ite.hasNext()) {
			Student stu = ite.next();
			System.out.println("(老师班级的学生)学生姓名"+stu.getStudentUsername());
		}		
		session.setAttribute("teaclStudentList", teaclStudentList);
		return "teaClassList";
	}
	
	@Override
	public TeacherTimeTable getModel() {
		// TODO Auto-generated method stub
		return teaTimeTable;
	}

	public TeacherTimeTable getTeaTimeTable() {
		return teaTimeTable;
	}

	public void setTeaTimeTable(TeacherTimeTable teaTimeTable) {
		this.teaTimeTable = teaTimeTable;
	}

	public TeacherTimeTableService getTeaTimeTableService() {
		return teaTimeTableService;
	}

	public void setTeaTimeTableService(TeacherTimeTableService teaTimeTableService) {
		this.teaTimeTableService = teaTimeTableService;
	}

}
