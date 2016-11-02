package com.lrm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.LaboratoryDao;
import com.lrm.dao.impl.BaseDaoImpl;

import com.lrm.entity.Laboratory;
import com.lrm.entity.LaboratoryDevice;
import com.lrm.service.LaboratoryDeviceService;

@Service
@Transactional
public class LaboratoryDeviceServiceImpl extends BaseDaoImpl<LaboratoryDevice> implements LaboratoryDeviceService{

	@Resource
	LaboratoryDao dlabDao;
	
	@Override
	public List<LaboratoryDevice> getLabDeviceList() {
		// TODO Auto-generated method stub
		List<LaboratoryDevice> labDeviceList = null;
		labDeviceList = findAll();
		return labDeviceList;
	}

	@Override
	public void labDeviceAdd(LaboratoryDevice labDevice, long labid) {
		// TODO Auto-generated method stub
		Laboratory lab = dlabDao.getById(labid);
		labDevice.setLaboratory(lab);				
		save(labDevice);
	}
  
	@Override
	public void labDeviceDeleteById(long labDeviceId) {
		// TODO Auto-generated method stub
		delete(labDeviceId);
	}

}
