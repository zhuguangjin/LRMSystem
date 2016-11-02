package com.lrm.entity;

/**
 * @brief 学生成绩实体类
 * @author zhuguangjin
 *
 */
public class StudentScore {

	private long stuScoreId;//成绩表Id
	private Student student;//学生外键
	private Course course;//课程外键
	private Teacher teacher;//老师外键
	private String stuScore;//实验成绩
	
	public StudentScore() {
		
	}

	public StudentScore(long stuScoreId, Student student, Course course, Teacher teacher, String stuScore) {
		//super();
		this.stuScoreId = stuScoreId;
		this.student = student;
		this.course = course;
		this.teacher = teacher;
		this.stuScore = stuScore;
	}

	public long getStuScoreId() {
		return stuScoreId;
	}

	public void setStuScoreId(long stuScoreId) {
		this.stuScoreId = stuScoreId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getStuScore() {
		return stuScore;
	}

	public void setStuScore(String stuScore) {
		this.stuScore = stuScore;
	}
	
}
