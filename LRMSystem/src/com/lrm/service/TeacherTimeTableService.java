package com.lrm.service;


import java.util.List;


import com.lrm.dao.BaseDao;
import com.lrm.entity.Student;
import com.lrm.entity.TeacherTimeTable;

public interface TeacherTimeTableService extends BaseDao<TeacherTimeTable>{

	/**
	 * @param l 
	 * @brief 二维课表的赋值
	 * @return
	 */
	TeacherTimeTable[][] getTeaTimeTableByTeaId(long l);

	/**
	 * @brief 按老师Id获取课表
	 * @param teacherId
	 * @return
	 */
	List<TeacherTimeTable> getTeaClassListByTid(long teacherId);

	List<Student> getTeaClStudentByCname(String soclassName);
}
