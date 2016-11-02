package com.lrm.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.LabTimeTableDao;
import com.lrm.dao.LaboratoryDao;
import com.lrm.dao.StudentTimeTableDao;
import com.lrm.dao.TeacherDao;
import com.lrm.dao.TeacherTimeTableDao;
import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.LaboratoryTimeTable;
import com.lrm.entity.ReserveInfo;
import com.lrm.entity.ReserveSerchInfo;
import com.lrm.entity.StudentTimeTable;
import com.lrm.entity.Teacher;
import com.lrm.entity.TeacherTimeTable;
import com.lrm.service.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl extends BaseDaoImpl<Teacher> implements TeacherService {

	@Resource
	TeacherDao teacherDao;

	@Resource
	StudentTimeTableDao stuTimeTableDao;

	@Resource
	TeacherTimeTableDao teaTimeTableDao;

	@Resource
	LabTimeTableDao labTimeTableDao;

	@Resource
	LaboratoryDao laboratoryDao;

	@Override
	public List<Teacher> teacherFindAll() {
		// TODO Auto-generated method stub
		List<Teacher> teacherList = findAll();
		return teacherList;
	}

	@Override
	public void teacherAdd(Teacher teacher) {
		// TODO Auto-generated method stub
		save(teacher);
	}

	@Override
	public void teacherDeleteById(long teacherId) {
		// TODO Auto-generated method stub
		delete(teacherId);
	}

	@Override
	public Teacher teacherLogin(String teaUsername, String teaPassword) {
		// TODO Auto-generated method stub
		Teacher tea = null;
		tea = teacherDao.getTeacherByNameAndPassword(teaUsername, teaPassword);
		return tea;
	}

	@Override
	public Teacher getTeacherById(long teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher = getById(teacherId);
		return teacher;
	}

	@Override
	public void updateTeacherInfo(Teacher teacher) {
		// TODO Auto-generated method stub
		update(teacher);
	}

	
	@Override
	public ReserveInfo getReserveInfoList(ReserveSerchInfo serchInfo, long teacherId) {
		// TODO Auto-generated method stub
		ReserveInfo revLabList = new ReserveInfo();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date revTime = null;
		try {
			revTime = df.parse(serchInfo.getRevTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 获取学生课表信息
		StudentTimeTable stuTimeTable = stuTimeTableDao.getStuTimeTableByCTime(serchInfo.getRevCourseTime(),
				serchInfo.getRevClassName(), serchInfo.getRevWeek());	
		// 获取老师课表信息
		TeacherTimeTable teaTimeTable = teaTimeTableDao.getTeaTimeTableByCTime(serchInfo.getRevClassName(),
				serchInfo.getRevCourseTime(), serchInfo.getRevWeek());
		// 获取实验室的课表信息
		LaboratoryTimeTable labTimeTable = labTimeTableDao.getLabTimeTableByCTime(serchInfo.getRevLabName(),
				serchInfo.getRevWeek(), serchInfo.getRevTime());

		// 进行比较
		if ((stuTimeTable != null) || (teaTimeTable != null)||(labTimeTable != null)) {			
			return revLabList;			
		}
		revLabList.setcRevLabName(serchInfo.getRevLabName());
		revLabList.setcRevLabLocation(laboratoryDao.getLabByName(serchInfo.getRevLabName()).getLabLocation());
		revLabList.setcRevData(revTime);
		// 将查询结果保存到List中
		return revLabList;
	}

}
