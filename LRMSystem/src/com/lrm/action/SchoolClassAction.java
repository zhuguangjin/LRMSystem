package com.lrm.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.SchoolClass;
import com.lrm.service.SchoolClassService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 班级Action
 * @author zhuguangjin
 *
 */

@Scope("prototype")
@Controller("SchoolClassAction")
public class SchoolClassAction extends BaseAction implements ModelDriven<SchoolClass> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SchoolClass schooClass = new SchoolClass();

	@Resource
	private SchoolClassService schoolClassService;

	/**
	 * @brief 班级列表
	 * @return
	 */
	public String sclassListUI() {
		List<SchoolClass> sclassList = schoolClassService.sclassFindAll();
		session.setAttribute("sclassList", sclassList);
		return "sclassListUI";
	}

	/**
	 * 
	 * @return
	 */
	public String sclassAddUI() {		
		return "sclassAddUI";
	}
	
	/**
	 * @brief 班级添加
	 * @return
	 */
	public String sclassAdd() {
		schoolClassService.sclassAdd(schooClass);
		return "toSclassListUI";
	}

	/**
	 * @brief 删除班级
	 * @return
	 */
	public String sclassDelete() {

		schoolClassService.sclassDeleteById(schooClass.getSoclassId());
		return "toSclassListUI";
	}

	@Override
	public SchoolClass getModel() {
		// TODO Auto-generated method stub
		return schooClass;
	}

	public SchoolClass getSchooClass() {
		return schooClass;
	}

	public void setSchooClass(SchoolClass schooClass) {
		this.schooClass = schooClass;
	}

	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}

	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}
}
