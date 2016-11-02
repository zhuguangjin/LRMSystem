package com.lrm.entity;

/**
 * @brief 预约查询讯息封装
 * @author zhuguangjin
 *
 */
public class ReserveSerchInfo {

	private String revClassName;// 班级名称
	private String revLabName;// 实验室名称
	private String revCourseTime;// 课程节数
	private String revTime;// 实验室预约时间
	private String revWeek;//根据日期自己换算出来的星期

	public ReserveSerchInfo() {
	}

	public ReserveSerchInfo(String revClassName, String revLabName, String revCourseTime, String revTime,
			String revWeek) {
		//super();
		this.revClassName = revClassName;
		this.revLabName = revLabName;
		this.revCourseTime = revCourseTime;
		this.revTime = revTime;
		this.revWeek = revWeek;
	}

	public String getRevClassName() {
		return revClassName;
	}

	public void setRevClassName(String revClassName) {
		this.revClassName = revClassName;
	}

	public String getRevLabName() {
		return revLabName;
	}

	public void setRevLabName(String revLabName) {
		this.revLabName = revLabName;
	}

	public String getRevCourseTime() {
		return revCourseTime;
	}

	public void setRevCourseTime(String revCourseTime) {
		this.revCourseTime = revCourseTime;
	}

	public String getRevTime() {
		return revTime;
	}

	public void setRevTime(String revTime) {
		this.revTime = revTime;
	}

	public String getRevWeek() {
		return revWeek;
	}

	public void setRevWeek(String revWeek) {
		this.revWeek = revWeek;
	}

}
