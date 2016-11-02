package com.lrm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @brief 老师实体类
 * @author zhuguangjin
 *
 */
public class Teacher {

	private long teacherId;// 老师ID
	private String teacherUsername;// 老师用户名
	private String teacherPassword;// 老师密码
	private String teacherNumber;// 老师工号
	private String teacherPhoneNum;// 老师电话号码
	private String teacherEmail;// 老师邮箱
	
	private Set<StudentScore> stuScore = new HashSet<StudentScore>();//班级学生

	public Teacher() {

	}

	public Teacher(long teacherId, String teacherUsername, String teacherPassword, String teacherNumber,
			String teacherPhoneNum, String teacherEmail, Set<StudentScore> stuScore) {
		//super();
		this.teacherId = teacherId;
		this.teacherUsername = teacherUsername;
		this.teacherPassword = teacherPassword;
		this.teacherNumber = teacherNumber;
		this.teacherPhoneNum = teacherPhoneNum;
		this.teacherEmail = teacherEmail;
		this.stuScore = stuScore;
	}



	public long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherUsername() {
		return teacherUsername;
	}

	public void setTeacherUsername(String teacherUsername) {
		this.teacherUsername = teacherUsername;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getTeacherPhoneNum() {
		return teacherPhoneNum;
	}

	public void setTeacherPhoneNum(String teacherPhoneNum) {
		this.teacherPhoneNum = teacherPhoneNum;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public Set<StudentScore> getStuScore() {
		return stuScore;
	}

	public void setStuScore(Set<StudentScore> stuScore) {
		this.stuScore = stuScore;
	}

}
