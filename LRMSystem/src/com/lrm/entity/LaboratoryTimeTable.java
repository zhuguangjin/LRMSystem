package com.lrm.entity;

import java.util.Date;
/**
 * @brief 实验室课表实体类
 * @author zhuguangjin
 *
 */
public class LaboratoryTimeTable {

	private long labTimeTableId;//实验室实验课表Id
	private  String labTimeTableWeek;//课表中课程上课星期次
	private Course labTableCourse;//课表中课程外键
	private SchoolClass labSchoolClass;//课表班级外键
	private Room labTableRoom;//课表中教室外键
	private Teacher labTeacher;//任课老师
	private Date labTime = new Date();//这节课要实验的时间
	private String labStatus;//这节课实验的状态
	private Laboratory labLaboratory;//实验实验室
	public LaboratoryTimeTable() {
		
	}
	public LaboratoryTimeTable(long labTimeTableId, String labTimeTableWeek, Course labTableCourse,
			SchoolClass labSchoolClass, Room labTableRoom, Teacher labTeacher, Date labTime, String labStatus,
			Laboratory labLaboratory) {
		//super();
		this.labTimeTableId = labTimeTableId;
		this.labTimeTableWeek = labTimeTableWeek;
		this.labTableCourse = labTableCourse;
		this.labSchoolClass = labSchoolClass;
		this.labTableRoom = labTableRoom;
		this.labTeacher = labTeacher;
		this.labTime = labTime;
		this.labStatus = labStatus;
		this.labLaboratory = labLaboratory;
	}
	public long getLabTimeTableId() {
		return labTimeTableId;
	}
	public void setLabTimeTableId(long labTimeTableId) {
		this.labTimeTableId = labTimeTableId;
	}
	public String getLabTimeTableWeek() {
		return labTimeTableWeek;
	}
	public void setLabTimeTableWeek(String labTimeTableWeek) {
		this.labTimeTableWeek = labTimeTableWeek;
	}
	public Course getLabTableCourse() {
		return labTableCourse;
	}
	public void setLabTableCourse(Course labTableCourse) {
		this.labTableCourse = labTableCourse;
	}
	public SchoolClass getLabSchoolClass() {
		return labSchoolClass;
	}
	public void setLabSchoolClass(SchoolClass labSchoolClass) {
		this.labSchoolClass = labSchoolClass;
	}
	public Room getLabTableRoom() {
		return labTableRoom;
	}
	public void setLabTableRoom(Room labTableRoom) {
		this.labTableRoom = labTableRoom;
	}
	public Teacher getLabTeacher() {
		return labTeacher;
	}
	public void setLabTeacher(Teacher labTeacher) {
		this.labTeacher = labTeacher;
	}
	public Date getLabTime() {
		return labTime;
	}
	public void setLabTime(Date labTime) {
		this.labTime = labTime;
	}
	public String getLabStatus() {
		return labStatus;
	}
	public void setLabStatus(String labStatus) {
		this.labStatus = labStatus;
	}
	public Laboratory getLabLaboratory() {
		return labLaboratory;
	}
	public void setLabLaboratory(Laboratory labLaboratory) {
		this.labLaboratory = labLaboratory;
	}

	
}
