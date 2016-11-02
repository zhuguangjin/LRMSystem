package com.lrm.dao;

import java.util.List;

/**
 * @author zhuguangjin
 * @brief 基础DAO接口
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * @保存实体
	 * @param entity
	 */
	public void save(T entity);
	
	/**
	 * 删除实体
	 * @param id
	 */
	public void delete(long id);
	
	/**
	 * 更新实体
	 * @param entity
	 */
	public void update(T entity);
	
	/**
	 * 按ID查询
	 * @param id
	 * @return
	 */
	public T getById(long id);
	
	/**
	 * 按ID查询
	 * @param id
	 * @return
	 */
	public List<T> getByIds(Long[] ids);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<T> findAll();	
}
