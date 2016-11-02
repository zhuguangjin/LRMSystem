package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.Admin;

/**
 * @author zhuguangjin
 * @brief 管理员业务逻辑接口
 */
public interface AdminService extends BaseDao<Admin>{

	/**
	 * @brief 管理员登录逻辑接口
	 * @param s_username
	 * @param s_password
	 * @return
	 */
	Admin admin_login(String adminUsername, String adminPassword);
	
	/**
	 * @brief 查询所有
	 * @return
	 */
	List<Admin> admin_findAll();

	/**
	 * @brief 按ID删除
	 * @param adminId
	 */
	void admin_delete(long adminId);

	/**
	 * @brief 添加管理员
	 * @param admin
	 */
	void admin_add(Admin admin);

	/**
	 * @brief 按ID获取
	 * @param adminId
	 * @return
	 */
	Admin admin_edit_getById(long adminId);
	
	/**
	 * @brief 更新实体
	 * @param a
	 */
	void  admin_edit_update(Admin a);
}
