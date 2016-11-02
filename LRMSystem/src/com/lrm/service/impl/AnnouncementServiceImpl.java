package com.lrm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.Announcement;
import com.lrm.service.AnnouncementService;


/**
 * @author zhuguangjin
 * @brief Announcement业务逻辑接口实现类
 */
@Service
@Transactional
public class AnnouncementServiceImpl  extends BaseDaoImpl<Announcement> implements AnnouncementService {

	@Override
	public List<Announcement> anno_findAll() {
		// TODO Auto-generated method stub
		List<Announcement> annoList = findAll();
		return annoList;
	}

	@Override
	public Announcement annoSeeById(long annoId) {
		// TODO Auto-generated method stub
		return getById(annoId);
	}

	@Override
	public void annoAdd(Announcement anno) {
		// TODO Auto-generated method stub
		save(anno);
	}

	@Override
	public void annoDelete(long annoId) {
		// TODO Auto-generated method stub
		delete(annoId);
	}

	


}
