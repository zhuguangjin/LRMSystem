package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.lrm.entity.StudentScore;
import com.lrm.service.StudentScoreService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 学生成绩实体类
 * @author zhuguangjin
 *
 */

@Scope("prototype")
@Controller("StudentScoreAction")
public class StudentScoreAction extends BaseAction implements ModelDriven<StudentScore> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	StudentScoreService studentScoreService;

	StudentScore studentScore = new StudentScore();

	/**
	 * @brief 学生成绩列表
	 * @return
	 */
	public String stuScoreListUI() {
		List<StudentScore> stuScoreList = studentScoreService.stuScoreFindAll();
		session.setAttribute("stuScoreList", stuScoreList);
		return "stuScoreListUI";
	}

	/**
	 * @brief 按班级名称查找
	 * @return
	 */
	public String stuScoreListByClass() {

		String soclassName = request.getParameter("student.schoolClass.soclassName");
		System.out.println("班级名称："+soclassName);
		List<StudentScore> stuScoreList = studentScoreService.getStuScoreByClassName(soclassName);
		//ActionContext.getContext().put("studentList", studentList);
		session.setAttribute("stuScoreList", stuScoreList);
		return "toStuScoreList";
	}

	/**
	 * @brief 按学号查找
	 * @return
	 */
	public String stuScoreListByStuNumber() {

		String StuNumber = request.getParameter("student.studentNumber");
		System.out.println("学号："+StuNumber);
		List<StudentScore> stuScoreList = studentScoreService.getStuScoreByStuNumber(StuNumber);
		//ActionContext.getContext().put("studentList", studentList);
		session.setAttribute("stuScoreList", stuScoreList);
		return "toStuScoreList";
	}

	/**
	 * @brief 按老师查找
	 * @return
	 */
	public String stuScoreListByTeacher() {

		String teacherUsername = request.getParameter("teacher.teacherUsername");
		System.out.println("老师名字："+teacherUsername);
		List<StudentScore> stuScoreList = studentScoreService.getStuScoreByTeacherName(teacherUsername);
		//ActionContext.getContext().put("studentList", studentList);
		session.setAttribute("stuScoreList", stuScoreList);
		return "toStuScoreList";
	}

	/**
	 * @brief 删除成绩
	 * @return
	 */
	public String stuScoreDelete() {
		studentScoreService.stuScoreDeleteById(studentScore.getStuScoreId());
		return "toStuScoreListUI";
	}

	@Override
	public StudentScore getModel() {
		// TODO Auto-generated method stub
		return studentScore;
	}

	public StudentScoreService getStudentScoreService() {
		return studentScoreService;
	}

	public void setStudentScoreService(StudentScoreService studentScoreService) {
		this.studentScoreService = studentScoreService;
	}

	public StudentScore getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(StudentScore studentScore) {
		this.studentScore = studentScore;
	}

}
