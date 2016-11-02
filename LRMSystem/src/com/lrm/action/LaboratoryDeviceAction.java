package com.lrm.action;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.lrm.entity.LaboratoryDevice;
import com.lrm.service.LaboratoryDeviceService;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @brief 实验室设备Action类
 * @author zhuguangjin
 *
 */
@Scope("prototype")
@Controller("LaboratoryDeviceAction")
public class LaboratoryDeviceAction extends BaseAction implements ModelDriven<LaboratoryDevice>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LaboratoryDevice labDevice = new LaboratoryDevice();
	
	@Resource
	LaboratoryDeviceService labDeviceService;
	
	/**
	 * @brief 
	 * @return
	 */

	public String labDeviceListUI() {
	
		List<LaboratoryDevice> labDeviceList = labDeviceService.getLabDeviceList();
		session.setAttribute("labDeviceList", labDeviceList);		
		return "labDeviceListUI";
	}
	
	/**
	 * @brief
	 * @return
	 */
	public String labDeviceAddUI() {
		return "labDeviceAddUI";
	}
	
	/**
	 * @brief 
	 * @return
	 */
	public String labDeviceAdd() {
		String slabid= request.getParameter("laboratory.labId");
		long labid = Long.valueOf(slabid).longValue();
		System.out.println("实验室Id"+labid);
		labDeviceService.labDeviceAdd(labDevice, labid);
		return "toLabDeviceListUI";
	}
	
	/**
	 * @brief 
	 * @return
	 */
	public String labDeviceDelete() {
		labDeviceService.labDeviceDeleteById(labDevice.getLabDeviceId());
		return "toLabDeviceListUI";
	}
	
	
	@Override
	public LaboratoryDevice getModel() {
		// TODO Auto-generated method stub	
		return labDevice;
	}

	public LaboratoryDevice getLabDevice() {
		return labDevice;
	}

	public void setLabDevice(LaboratoryDevice labDevice) {
		this.labDevice = labDevice;
	}

	public LaboratoryDeviceService getLabDeviceService() {
		return labDeviceService;
	}

	public void setLabDeviceService(LaboratoryDeviceService labDeviceService) {
		this.labDeviceService = labDeviceService;
	}

}
