package com.lrm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.StudentScoreDao;
import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.StudentScore;
import com.lrm.service.StudentScoreService;

@Service
@Transactional
public class StudentScoreServiceImpl extends BaseDaoImpl<StudentScore> implements StudentScoreService{
	
	@Resource
	StudentScoreDao studentScoreDao;
	
	@Override
	public List<StudentScore> stuScoreFindAll() {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		stuScoreList = findAll();
		return stuScoreList;
	}

	@Override
	public List<StudentScore> getStuScoreByClassName(String soclassName) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		stuScoreList = studentScoreDao.getStuScoreByClassName(soclassName);
		return stuScoreList;
	}

	@Override
	public List<StudentScore> getStuScoreByStuNumber(String stuNumber) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		stuScoreList = studentScoreDao.getStuScoreByStuNumber(stuNumber);
		return stuScoreList;
	}

	@Override
	public List<StudentScore> getStuScoreByTeacherName(String teacherUsername) {
		// TODO Auto-generated method stub
		List<StudentScore> stuScoreList = null;
		stuScoreList = studentScoreDao.getStuScoreByTeacherName(teacherUsername);
		return stuScoreList;
	}

	@Override
	public void stuScoreDeleteById(long stuScoreId) {
		// TODO Auto-generated method stub
		delete(stuScoreId);
	}

}
