package com.lrm.entity;


/**
 * @brief 学生实体类
 * @author zhuguangjin
 *
 */
public class Student {

	private long studentId;// 学生ID
	private String studentUsername;// 学生用户名
	private String studentPassword;// 学生密码
	private String studentNumber;// 学生学号

	private SchoolClass schoolClass;// 学生班级

	public Student() {

	}

	public Student(long studentId, String studentUsername, String studentPassword, String studentNumber,
			SchoolClass schoolClass) {
		//super();
		this.studentId = studentId;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentNumber = studentNumber;
		this.schoolClass = schoolClass;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentUsername() {
		return studentUsername;
	}

	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public SchoolClass getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

}
