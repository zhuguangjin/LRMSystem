package com.lrm.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * @brief 实验室实体类
 * @author zhuguangjin
 *
 */
public class Laboratory {

	private long labId;// 实验室Id
	private String labName;// 实验室名称
	private String labBrief;// 实验室简介
	private String labLocation;// 实验室位置
	private String labType;// 实验室可实验的类型
	private Set<LaboratoryDevice> labDevice = new HashSet<LaboratoryDevice>();//实验室设备资源
	private Teacher teacher;// 实验室负责老师

	public Laboratory() {

	}

	public Laboratory(long labId, String labName, String labBrief, String labLocation, String labType,
			Teacher teacher, Set<LaboratoryDevice> labDevice) {
		// super();
		this.labId = labId;
		this.labName = labName;
		this.labBrief = labBrief;
		this.labLocation = labLocation;
		this.labType = labType;
		this.teacher = teacher;
		this.labDevice = labDevice;
	}

	public long getLabId() {
		return labId;
	}

	public void setLabId(long labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabBrief() {
		return labBrief;
	}

	public void setLabBrief(String labBrief) {
		this.labBrief = labBrief;
	}

	public String getLabLocation() {
		return labLocation;
	}

	public void setLabLocation(String labLocation) {
		this.labLocation = labLocation;
	}

	public String getLabType() {
		return labType;
	}

	public void setLabType(String labType) {
		this.labType = labType;
	}

	public Set<LaboratoryDevice> getLabDevice() {
		return labDevice;
	}

	public void setLabDevice(Set<LaboratoryDevice> labDevice) {
		this.labDevice = labDevice;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	

}
