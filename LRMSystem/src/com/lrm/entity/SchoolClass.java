package com.lrm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @brief 班级实体类
 * @author zhuguangjin
 *
 */
public class SchoolClass {
	
	private long soclassId;//班级Id
	private String soclassName;//班级名称
	private String soclassGrade;//班级年级
	private String academy;//班级学院
	private String soclassMajor;//班级专业
	
	private Set<Student> soclassStudents = new HashSet<Student>();//班级学生

	public SchoolClass() {
		
	}

	public SchoolClass(long soclassId, String soclassName, String soclassGrade, String academy,
			String soclassMajor, Set<Student> soclassStudents) {
		//super();
		this.soclassId = soclassId;
		this.soclassName = soclassName;
		this.soclassGrade = soclassGrade;
		this.academy = academy;
		this.soclassMajor = soclassMajor;
		this.soclassStudents = soclassStudents;
	}

	public long getSoclassId() {
		return soclassId;
	}

	public void setSoclassId(long soclassId) {
		this.soclassId = soclassId;
	}

	public String getSoclassName() {
		return soclassName;
	}

	public void setSoclassName(String soclassName) {
		this.soclassName = soclassName;
	}

	public String getSoclassGrade() {
		return soclassGrade;
	}

	public void setSoclassGrade(String soclassGrade) {
		this.soclassGrade = soclassGrade;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getSoclassMajor() {
		return soclassMajor;
	}

	public void setSoclassMajor(String soclassMajor) {
		this.soclassMajor = soclassMajor;
	}

	public Set<Student> getSoclassStudents() {
		return soclassStudents;
	}

	public void setSoclassStudents(Set<Student> soclassStudents) {
		this.soclassStudents = soclassStudents;
	}
	
}
