package com.lrm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.lrm.dao.StudentScoreDao;
import com.lrm.entity.StudentScore;

@Repository
public class StudentScoreDaoImpl extends BaseDaoImpl<StudentScore> implements StudentScoreDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentScore> getStuScoreByClassName(String soclassName) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM StudentScore stuScore WHERE stuScore.student.schoolClass.soclassName=?");
		query.setParameter(0, soclassName);//
		stuScoreList = (List<StudentScore>) query.list();
		return stuScoreList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentScore> getStuScoreByStuNumber(String stuNumber) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM StudentScore stuScore WHERE stuScore.student.studentNumber=?");
		query.setParameter(0, stuNumber);//
		stuScoreList = (List<StudentScore>) query.list();
		return stuScoreList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentScore> getStuScoreByTeacherName(String teacherUsername) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		Session session = getSession();
		Query query = session.createQuery("FROM StudentScore stuScore WHERE stuScore.teacher.teacherUsername=?");
		query.setParameter(0, teacherUsername);//
		stuScoreList = (List<StudentScore>) query.list();
		return stuScoreList;
	}

}
