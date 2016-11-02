package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.Laboratory;
import com.lrm.service.LaboratoryService;
import com.opensymphony.xwork2.ModelDriven;


@Scope("prototype")
@Controller("LaboratoryAction")
public class LaboratoryAction extends BaseAction implements ModelDriven<Laboratory>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Laboratory laboratory = new Laboratory();
	
	@Resource
	LaboratoryService laboratoryService;
	
	/**
	 * @brief 实验室列表
	 * @return
	 */
	public String laboratoryListUI() {
		List<Laboratory> laboratoryList = laboratoryService.getLaboratoryList();
		session.setAttribute("laboratoryList", laboratoryList);
		return "laboratoryListUI";
	}

	/**
	 * @brief 实验室添加列表
	 * @return
	 */
	public String laboratoryAddUI() {
		
		return "laboratoryAddUI";
	}
	
	/**
	 * @brief 实验室添加
	 * @return
	 */
	public String laboratoryAdd() {
		laboratoryService.laboratoryAdd(laboratory);
		return "toLaboratoryListUI";
	}
	
	/**
	 * @brief 实验室删除
	 * @return
	 */
	public String laboratoryDelete() {
		laboratoryService.laboratoryDeleteById(laboratory.getLabId());
		return "toLaboratoryListUI";
	}
	
	@Override
	public Laboratory getModel() {
		// TODO Auto-generated method stub
		return laboratory;
	}


	public Laboratory getLaboratory() {
		return laboratory;
	}


	public void setLaboratory(Laboratory laboratory) {
		this.laboratory = laboratory;
	}


	public LaboratoryService getLaboratoryService() {
		return laboratoryService;
	}


	public void setLaboratoryService(LaboratoryService laboratoryService) {
		this.laboratoryService = laboratoryService;
	}

}
