package com.lrm.dao.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.StudentTimeTableDao;
import com.lrm.entity.StudentTimeTable;

@Repository
public class StudentTimeTableDaoImpl extends BaseDaoImpl<StudentTimeTable> implements StudentTimeTableDao{


	@Override
	public StudentTimeTable getStuTimeTableByCTime(String revCourseTime, String revClassName, String revWeek) {
		// TODO Auto-generated method stub
		StudentTimeTable stuTimeTableList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM StudentTimeTable stutable WHERE stutable.stuTableCourse.courseTime=? AND stutable.stuSchoolClass.soclassName=? AND stutable.stuCourseWeek=?");
		query.setParameter(0, revCourseTime);//
		query.setParameter(1, revClassName);
		query.setParameter(2, revWeek);
		stuTimeTableList = (StudentTimeTable) query.uniqueResult();
		return stuTimeTableList;
	}
}
