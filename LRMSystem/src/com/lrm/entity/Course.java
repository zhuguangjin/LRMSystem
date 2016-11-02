package com.lrm.entity;

/**
 * @brief 课程实体类
 * @author zhuguangjin
 *
 */
public class Course {
	
	private long courseId;//课程Id
	private String courseName;//课程名字
	private String courseTime;//课程时间
	private String courseNumber;//课程代码
	
	public Course() {
		
	}

	public Course(long courseId, String courseName, String courseTime, String courseNumber) {
		//super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTime = courseTime;
		this.courseNumber = courseNumber;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
}
