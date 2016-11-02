package com.lrm.entity;

/**
 * @brief 实验室设备资源实体类
 * @author zhuguangjin
 *
 */
public class LaboratoryDevice {
	
	private long labDeviceId;//实验室设备Id
	private String labDeviceName;//实验室设备名称
	private Laboratory laboratory;//设备所属实验室
	private long labDeviceNumber;//设备编号
	
	public LaboratoryDevice() {
		
	}

	public LaboratoryDevice(long labDeviceId, String labDeviceName, Laboratory laboratory, long labDeviceNumber) {
		//super();
		this.labDeviceId = labDeviceId;
		this.labDeviceName = labDeviceName;
		this.laboratory = laboratory;
		this.labDeviceNumber = labDeviceNumber;
	}

	public long getLabDeviceId() {
		return labDeviceId;
	}

	public void setLabDeviceId(long labDeviceId) {
		this.labDeviceId = labDeviceId;
	}

	public String getLabDeviceName() {
		return labDeviceName;
	}

	public void setLabDeviceName(String labDeviceName) {
		this.labDeviceName = labDeviceName;
	}

	public Laboratory getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(Laboratory laboratory) {
		this.laboratory = laboratory;
	}

	public long getLabDeviceNumber() {
		return labDeviceNumber;
	}

	public void setLabDeviceNumber(long labDeviceNumber) {
		this.labDeviceNumber = labDeviceNumber;
	}
}
