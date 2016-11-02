package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Announcement;
import com.lrm.service.AnnouncementService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author zhuguangjin
 * @brief 公告Action类
 */

@Scope("prototype")
@Controller("AnnouncementAction")
public class AnnouncementAction extends BaseAction implements ModelDriven<Announcement> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Announcement anno = new Announcement();

	@Resource
	private AnnouncementService AnnoService;

	/**
	 * @brief 公告列表
	 * @return
	 */
	public String annoListUI() {
		List<Announcement> annoList = AnnoService.anno_findAll();
		session.setAttribute("annoList", annoList);
		return "annoListUI";

	}

	/**
	 * @brief 查看公告
	 * @return
	 */
	public String annoSeeUI() {
		Announcement annoSee = AnnoService.annoSeeById(anno.getAnnoId());

		session.setAttribute("annoSee", annoSee);
		return "annoSeeUI";

	}

	/**
	 * @brief 公告添加页面
	 * @return
	 */
	public String annoAddUI() {
		return "annoAddUI";
	}

	/**
	 * @brief 公告添加
	 * @return
	 */
	public String annoAdd() {
		AnnoService.annoAdd(anno);
		return "toAnnoListUI";
	}

	public String annoDelete() {
		AnnoService.annoDelete(anno.getAnnoId());
		return "toAnnoListUI";
	}

	@Override
	public Announcement getModel() {
		// TODO Auto-generated method stub
		return anno;
	}

	public AnnouncementService getAnnoService() {
		return AnnoService;
	}

	public void setAnnoService(AnnouncementService annoService) {
		AnnoService = annoService;
	}

}
