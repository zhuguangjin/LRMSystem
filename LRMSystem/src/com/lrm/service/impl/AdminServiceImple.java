package com.lrm.service.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.Admin;
import com.lrm.service.AdminService;

/**
 * @author zhuguangjin
 * @brief 管理员业务逻辑接口实现类
 */

@Service
@Transactional
public class AdminServiceImple extends BaseDaoImpl<Admin> implements AdminService {

	
	
	Admin admin;
	@Override
	public Admin admin_login(String adminUsername, String adminPassword) {
		// TODO Auto-generated method stub
		// 使用密码的MD5摘要进行对比
		//String md5Digest = DigestUtils.md5Hex(s_password);
		
		Session session = getSession();
		Query query = session.createQuery("FROM Admin a WHERE a.adminUsername=? AND a.adminPassword=?");
		query.setParameter(0, adminUsername);//
		query.setParameter(1, adminPassword);//
		admin = (Admin) query.uniqueResult();
		return admin;
	}

	@Override
	public List<Admin> admin_findAll() {
		// TODO Auto-generated method stub
	     List<Admin> AdminList = findAll();
		return AdminList;
	}

	@Override
	public void admin_delete(long adminId) {
		// TODO Auto-generated method stub
		delete(adminId);
	}

	@Override
	public void admin_add(Admin admin) {
		// TODO Auto-generated method stub
		save(admin);
	}

	@Override
	public Admin admin_edit_getById(long adminId) {
		// TODO Auto-generated method stub
		Admin editAdmin = getById(adminId);
		if(editAdmin != null) {
			return editAdmin;
		}
		return null;
	}

	@Override
	public void admin_edit_update(Admin a) {
		// TODO Auto-generated method stub
		update(a);
	}


}
