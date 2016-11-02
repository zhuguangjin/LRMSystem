package com.lrm.entity;

/**
 * @author zhuguangjin
 * @brief 公告实体类
 */
public class Announcement {

	private long annoId;// 公告ID
	private String annoTitle;// 公告标题
	private String annoContent;// 公告内容
	private String annoPerson;// 公告人
	private String annoTime;// 公告时间

	public Announcement() {

	}

	public Announcement(long annoId, String annoTitle, String annoContent, String annoPerson, String annoTime) {
		// super();
		this.annoId = annoId;
		this.annoTitle = annoTitle;
		this.annoContent = annoContent;
		this.annoPerson = annoPerson;
		this.annoTime = annoTime;
	}

	public long getAnnoId() {
		return annoId;
	}

	public void setAnnoId(long annoId) {
		this.annoId = annoId;
	}

	public String getAnnoTitle() {
		return annoTitle;
	}

	public void setAnnoTitle(String annoTitle) {
		this.annoTitle = annoTitle;
	}

	public String getAnnoContent() {
		return annoContent;
	}

	public void setAnnoContent(String annoContent) {
		this.annoContent = annoContent;
	}

	public String getAnnoPerson() {
		return annoPerson;
	}

	public void setAnnoPerson(String annoPerson) {
		this.annoPerson = annoPerson;
	}

	public String getAnnoTime() {
		return annoTime;
	}

	public void setAnnoTime(String annoTime) {
		this.annoTime = annoTime;
	}

}
