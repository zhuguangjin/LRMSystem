package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.LaboratoryDevice;

public interface LaboratoryDeviceService extends BaseDao<LaboratoryDevice>{

	List<LaboratoryDevice> getLabDeviceList();

	void labDeviceAdd(LaboratoryDevice labDevice, long labid);

	void labDeviceDeleteById(long labDeviceId);

}
