package com.lrm.entity;

import java.util.Date;

/**
 * @brief 学生课表实体类
 * @author zhuguangjin
 *
 */
public class StudentTimeTable {
	
	private long stuTacleId;//学生课表Id
	private String stuCourseWeek;//学生课表中上课星期次
	private Course stuTableCourse;//课表中的课程外键
	private Room stuTableRoom;//课表中的教室外键
	private SchoolClass stuSchoolClass;//课表班级外键
	private Date stuLabTime = new Date();//这节课要实验的时间
	private Teacher stuTeacher;
	public StudentTimeTable() {
		
	}
	public StudentTimeTable(long stuTacleId, String stuCourseWeek, Course stuTableCourse, Room stuTableRoom,
			SchoolClass stuSchoolClass, Date stuLabTime, Teacher stuTeacher) {
		//super();
		this.stuTacleId = stuTacleId;
		this.stuCourseWeek = stuCourseWeek;
		this.stuTableCourse = stuTableCourse;
		this.stuTableRoom = stuTableRoom;
		this.stuSchoolClass = stuSchoolClass;
		this.stuLabTime = stuLabTime;
		this.stuTeacher = stuTeacher;
	}
	public long getStuTacleId() {
		return stuTacleId;
	}
	public void setStuTacleId(long stuTacleId) {
		this.stuTacleId = stuTacleId;
	}
	public String getStuCourseWeek() {
		return stuCourseWeek;
	}
	public void setStuCourseWeek(String stuCourseWeek) {
		this.stuCourseWeek = stuCourseWeek;
	}
	public Course getStuTableCourse() {
		return stuTableCourse;
	}
	public void setStuTableCourse(Course stuTableCourse) {
		this.stuTableCourse = stuTableCourse;
	}
	public Room getStuTableRoom() {
		return stuTableRoom;
	}
	public void setStuTableRoom(Room stuTableRoom) {
		this.stuTableRoom = stuTableRoom;
	}
	public SchoolClass getStuSchoolClass() {
		return stuSchoolClass;
	}
	public void setStuSchoolClass(SchoolClass stuSchoolClass) {
		this.stuSchoolClass = stuSchoolClass;
	}
	public Date getStuLabTime() {
		return stuLabTime;
	}
	public void setStuLabTime(Date stuLabTime) {
		this.stuLabTime = stuLabTime;
	}
	public Teacher getStuTeacher() {
		return stuTeacher;
	}
	public void setStuTeacher(Teacher stuTeacher) {
		this.stuTeacher = stuTeacher;
	}

	
}
