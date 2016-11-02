package com.lrm.action;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Admin;
import com.lrm.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author zhuguangjin
 * @brief 管理员Action类
 */
@Scope("prototype")
@Controller("AdminAction")
public class AdminAction extends BaseAction implements ModelDriven<Admin> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Admin admin = new Admin();

	/**
	 * @brief 业务逻辑对象
	 */
	@Resource
	private AdminService AdminService;

	/**
	 * @brief 管理员登录界面
	 * @return
	 * @throws Exception
	 */
	public String logonUI() throws Exception {
		return "adminLoginUI";
	}

	/**
	 * @brief 管理员登录
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	public String logon() throws Exception {
		System.out.println("(管理员登录)用户名密码和ID："+admin.getAdminUsername() + admin.getAdminPassword()+admin.getAdminId());
		Admin loginAdmin = AdminService.admin_login(admin.getAdminUsername(), admin.getAdminPassword());
		if (loginAdmin != null) {
			session.putValue("admin_username", loginAdmin.getAdminUsername());
			session.setAttribute("loginAdmin", loginAdmin);
		} else {
			return "adminLoginUI";// 返回后台登录页面
		}
		return "toIndex";
	}

	/**
	 * @brief 管理员退出
	 * @return
	 * @throws Exception
	 */
	public String logout() throws Exception {
		ActionContext.getContext().getSession().remove("admin");
		return "adminLogoutUI";
	}

	/**
	 * @brief 管理员个人信息
	 * @return
	 * @throws Exception
	 */
	public String adminInfo() throws Exception {
		return "toAdminInfoUI";
	}

	/**
	 * @brief 管理员用户列表
	 * @return
	 * @throws Exception
	 */
	public String adminListUI() throws Exception {
		List<Admin> AdminList = AdminService.admin_findAll();
		Iterator<Admin> itr = AdminList.iterator();
		while (itr.hasNext()) {
			Admin str = itr.next();
			System.out.println(str.getAdminUsername());
			System.out.println(str.getAdminId());
			System.out.println(str.getAdminBirthday());
			System.out.println(str.getAdminEmail());
		}	
		if (AdminList != null && AdminList.size() > 0) {
			session.setAttribute("adminList", AdminList);
		}

		return "adminListUI";
	}

	/**
	 * @brief 管理员用户删除
	 * @return
	 * @throws Exception
	 */
	public String adminDelete() throws Exception {
		AdminService.admin_delete(admin.getAdminId());
		return "toAdminListUI";
	}

	/**
	 * @brief 管理员用户添加
	 * @return
	 * @throws Exception
	 */
	public String adminAdd() throws Exception {
		AdminService.admin_add(admin);
		return "toAdminListUI";
	}

	/**
	 * @brief 管理员用户添加UI
	 * @return
	 * @throws Exception
	 */
	public String adminAddUI() throws Exception {
		return "adminAddUI";
	}

	/**
	 * @brief 管理员用户修改
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	public String adminEdit() throws Exception {
		System.out.println("(管理员修改信息)管理员ID"+admin.getAdminId());
		Admin editAdmin = AdminService.admin_edit_getById(admin.getAdminId());
		Admin loginAdmin;
		if (editAdmin != null) {
			System.out.println("编辑之前:" + editAdmin.getAdminPhone());
			editAdmin.setAdminUsername(admin.getAdminUsername());
			editAdmin.setAdminPassword(admin.getAdminPassword());
			editAdmin.setAdminSex(admin.getAdminSex());
			editAdmin.setAdminBirthday(admin.getAdminBirthday());
			editAdmin.setAdminPhone(admin.getAdminPhone());
			editAdmin.setAdminEmail(admin.getAdminEmail());
			AdminService.admin_edit_update(editAdmin);

			loginAdmin = editAdmin;
			session.putValue("admin_username", loginAdmin.getAdminUsername());
			session.setAttribute("loginAdmin", loginAdmin);

			System.out.println("编辑之后:" + editAdmin.getAdminPhone());
			return "toAdminInfoUI";
		}
		return "ERROR";
	}

	/**
	 * @brief 管理员用户修改UI
	 * @return
	 * @throws Exception
	 */
	public String adminEditUI() throws Exception {
		return "adminEditUI";
	}

	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
