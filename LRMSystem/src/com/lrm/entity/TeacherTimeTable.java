package com.lrm.entity;

import java.util.Date;
/**
 * @brief 老师课表实体类
 * @author zhuguangjin
 *
 */
public class TeacherTimeTable {

	private long teaTimeTableId;//老师课表Id
	private String teaCourseWeek;//课表中课程上课星期次
	private Course teaTableCourse;//课表中课程外键
	private SchoolClass teaSchoolClass ;//课表班级外键
	private Room teaTableRoom;//课表中教室外键
	private Date teaLabTime = new Date();//这节课要实验的时间
	private Teacher teaTeacher;
	public TeacherTimeTable() {
		
	}
	public TeacherTimeTable(long teaTimeTableId, String teaCourseWeek, Course teaTableCourse,
			SchoolClass teaSchoolClass, Room teaTableRoom, Date teaLabTime, Teacher teaTeacher) {
		//super();
		this.teaTimeTableId = teaTimeTableId;
		this.teaCourseWeek = teaCourseWeek;
		this.teaTableCourse = teaTableCourse;
		this.teaSchoolClass = teaSchoolClass;
		this.teaTableRoom = teaTableRoom;
		this.teaLabTime = teaLabTime;
		this.teaTeacher = teaTeacher;
	}
	public long getTeaTimeTableId() {
		return teaTimeTableId;
	}
	public void setTeaTimeTableId(long teaTimeTableId) {
		this.teaTimeTableId = teaTimeTableId;
	}
	public String getTeaCourseWeek() {
		return teaCourseWeek;
	}
	public void setTeaCourseWeek(String teaCourseWeek) {
		this.teaCourseWeek = teaCourseWeek;
	}
	public Course getTeaTableCourse() {
		return teaTableCourse;
	}
	public void setTeaTableCourse(Course teaTableCourse) {
		this.teaTableCourse = teaTableCourse;
	}
	public SchoolClass getTeaSchoolClass() {
		return teaSchoolClass;
	}
	public void setTeaSchoolClass(SchoolClass teaSchoolClass) {
		this.teaSchoolClass = teaSchoolClass;
	}
	public Room getTeaTableRoom() {
		return teaTableRoom;
	}
	public void setTeaTableRoom(Room teaTableRoom) {
		this.teaTableRoom = teaTableRoom;
	}
	public Date getTeaLabTime() {
		return teaLabTime;
	}
	public void setTeaLabTime(Date teaLabTime) {
		this.teaLabTime = teaLabTime;
	}
	public Teacher getTeaTeacher() {
		return teaTeacher;
	}
	public void setTeaTeacher(Teacher teaTeacher) {
		this.teaTeacher = teaTeacher;
	}

	

}
