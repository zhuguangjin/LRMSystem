package com.lrm.dao;

import com.lrm.entity.Laboratory;

public interface LaboratoryDao extends BaseDao<Laboratory>{
	Laboratory getLabByName(String labName);
}
