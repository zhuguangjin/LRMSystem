package com.lrm.action;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lrm.entity.LaboratoryTimeTable;
import com.lrm.service.LabTimeTableService;
import com.opensymphony.xwork2.ModelDriven;

@Scope("prototype")
@Controller("LabTimeTableAction")
public class LabTimeTableAction extends BaseAction implements ModelDriven<LaboratoryTimeTable> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LaboratoryTimeTable labTimeTable = new LaboratoryTimeTable();

	@Resource
	LabTimeTableService labTimeTableService;

	/**
	 * @brief 实验室申请状态
	 * @author zhuguangjin
	 *
	 */
	public interface labtbStatus{
		
		public final String Unhandle = "已申请";
		public final String Handle = "已处理";
		public final String Finished = "已完成";
	}  
	
	/**
	 * @brief 未处理预约列表
	 * @return
	 */
	public String labNotHandleListUI() {

		List<LaboratoryTimeTable> labtbList = labTimeTableService.getLabTimeTableList(labtbStatus.Unhandle);
		request.setAttribute("labtbList", labtbList);
		return "labNotHandleListUI";
	}

	/**
	 * @brief 确认未处理预约
	 * @return
	 */
	public String labReserveConfirm() {
		labTimeTableService.confirmUnhanleLab(labTimeTable.getLabTimeTableId(), labtbStatus.Handle);
		return "toLabNotHandleListUI";
	}

	/**
	 * @brief 未处理预约删除
	 * @return
	 */
	public String labNotHandleDelete() {
		labTimeTableService.LabTimeTableDeleteById(labTimeTable.getLabTimeTableId());
		return "toLabNotHandleListUI";
	}

	/**
	 * @brief 已处理预约列表
	 * @return
	 */
	public String labHandleListUI() {

		List<LaboratoryTimeTable> labtbList = labTimeTableService.getLabTimeTableList(labtbStatus.Handle);
		request.setAttribute("labtbList", labtbList);
		return "labHandleListUI";
	}

	/**
	 * @brief 已处理预约删除
	 * @return
	 */
	public String labHandleDelete() {
		labTimeTableService.LabTimeTableDeleteById(labTimeTable.getLabTimeTableId());
		return "toLabHandleListUI";
	}

	/**
	 * @brief 已完成实验列表
	 * @return
	 */
	public String labFinishedListUI() {
		List<LaboratoryTimeTable> labtbList = labTimeTableService.getLabTimeTableList(labtbStatus.Finished);
		Iterator<LaboratoryTimeTable> ite = labtbList.iterator();
		while(ite.hasNext())
		{
			LaboratoryTimeTable latt = ite.next();
			System.out.println(latt.getLabTeacher().getTeacherUsername());
		}
		request.setAttribute("labtbList", labtbList);
		return "labFinishedListUI";
	}

	/**
	 * @brief 已完成实验删除
	 * @return
	 */
	public String labFinishedDelete() {
		labTimeTableService.LabTimeTableDeleteById(labTimeTable.getLabTimeTableId());
		return "toLabFinishedListUI";
	}

	@Override
	public LaboratoryTimeTable getModel() {
		// TODO Auto-generated method stub
		return labTimeTable;
	}

	public LaboratoryTimeTable getLabTimeTable() {
		return labTimeTable;
	}

	public void setLabTimeTable(LaboratoryTimeTable labTimeTable) {
		this.labTimeTable = labTimeTable;
	}

	public LabTimeTableService getLabTimeTableService() {
		return labTimeTableService;
	}

	public void setLabTimeTableService(LabTimeTableService labTimeTableService) {
		this.labTimeTableService = labTimeTableService;
	}

}
