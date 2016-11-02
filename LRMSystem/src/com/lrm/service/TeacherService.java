package com.lrm.service;

import java.util.List;

import com.lrm.dao.BaseDao;
import com.lrm.entity.ReserveInfo;
import com.lrm.entity.ReserveSerchInfo;
import com.lrm.entity.Teacher;

public interface TeacherService extends BaseDao<Teacher> {

	List<Teacher> teacherFindAll();

	void teacherAdd(Teacher teacher);

	void teacherDeleteById(long teacherId);

	Teacher teacherLogin(String teaUsername, String teaPassword);

	Teacher getTeacherById(long teacherId);

	void updateTeacherInfo(Teacher teacher);

	ReserveInfo getReserveInfoList(ReserveSerchInfo serchInfo, long teacherId);

}
