package com.lrm.dao;

import java.util.List;

import com.lrm.entity.Student;

/**
 * @brief 学生Dao接口
 * @author zhuguangjin
 *
 */

public interface StudentsDao extends BaseDao<Student>{

	public List<Student> getByNumber(String studentNumber);
	
	public void printstr();

	public List<Student> getByClassName(String className);

	public List<Student> getByMajor(String studentMajor);
}
