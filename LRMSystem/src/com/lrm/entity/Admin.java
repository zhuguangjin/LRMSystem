package com.lrm.entity;

/**
 * @author zhuguangjin
 * @brief 管理员实体类
 */
public class Admin {

	private long adminId;// 管理员ID
	private String adminUsername;// 管理员用户名
	private String adminPassword;// 管理员密码
	private String adminSex;//性别
	private String adminBirthday;//出生日期
	private String adminPhone;//电话号码
	private String adminEmail;//邮箱
	
	
	public Admin(){
		
	}


	public Admin(long adminId, String adminUsername, String adminPassword, String adminSex, String adminBirthday,
			String adminPhone, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminSex = adminSex;
		this.adminBirthday = adminBirthday;
		this.adminPhone = adminPhone;
		this.adminEmail = adminEmail;
	}


	public long getAdminId() {
		return adminId;
	}


	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}


	public String getAdminUsername() {
		return adminUsername;
	}


	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	public String getAdminSex() {
		return adminSex;
	}


	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex;
	}


	public String getAdminBirthday() {
		return adminBirthday;
	}


	public void setAdminBirthday(String adminBirthday) {
		this.adminBirthday = adminBirthday;
	}


	public String getAdminPhone() {
		return adminPhone;
	}


	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}


	public String getAdminEmail() {
		return adminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
	
}
