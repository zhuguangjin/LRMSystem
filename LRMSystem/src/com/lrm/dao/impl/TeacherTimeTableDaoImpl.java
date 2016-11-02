package com.lrm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.TeacherTimeTableDao;

import com.lrm.entity.TeacherTimeTable;

@Repository
public class TeacherTimeTableDaoImpl extends BaseDaoImpl<TeacherTimeTable> implements TeacherTimeTableDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<TeacherTimeTable> teaTimeTableByCourseTime(String courseTime, long teaId) {
		// TODO Auto-generated method stub
		List<TeacherTimeTable> teaCourseTaList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM TeacherTimeTable teata WHERE teata.teaTableCourse.courseTime=? AND teata.teaTeacher.teacherId=?");
		query.setParameter(0, courseTime);//
		query.setParameter(1, teaId);
		teaCourseTaList = (List<TeacherTimeTable>) query.list();
		return teaCourseTaList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TeacherTimeTable> getTeaTimeTableByTid(long teacherId) {
		// TODO Auto-generated method stub
		List<TeacherTimeTable> teaTableClassList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM TeacherTimeTable te WHERE te.teaTeacher.teacherId=?");
		query.setParameter(0, teacherId);//
		teaTableClassList = (List<TeacherTimeTable>)query.list();
		return teaTableClassList;
	}

	@Override
	public TeacherTimeTable getTeaTimeTableByCTime(String revClassName, String revCourseTime, String revWeek) {
		// TODO Auto-generated method stub
		TeacherTimeTable teaTimeTable = null;
		Session session = getSession();
		Query query = session.createQuery("FROM TeacherTimeTable revtea WHERE revtea.teaSchoolClass.soclassName=? AND revtea.teaTableCourse.courseTime=? AND revtea.teaCourseWeek=?");
		query.setParameter(0, revClassName);//
		query.setParameter(1, revCourseTime);//
		query.setParameter(2, revWeek);//
		teaTimeTable = (TeacherTimeTable) query.uniqueResult();
		return teaTimeTable;
	}

}
