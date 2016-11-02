package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.Announcement;


/**
 * @author zhuguangjin
 * @brief Announcement业务逻辑接口
 */
public interface AnnouncementService extends BaseDao<Announcement>{

	/**
	 * @brief 查询所有
	 * @return
	 */
	List<Announcement> anno_findAll();

	/**
	 * @brief 按ID查询
	 * @param annoId
	 * @return
	 */
	Announcement annoSeeById(long annoId);

	/**
	 * @brief 添加公告
	 * @param anno
	 */
	void annoAdd(Announcement anno);

	/**
	 * @brief 按ID删除
	 * @param annoId
	 */
	void annoDelete(long annoId);

   

	
}
