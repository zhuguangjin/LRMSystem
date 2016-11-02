package com.lrm.service.impl;


import java.util.Iterator;
import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lrm.dao.StudentsDao;
import com.lrm.dao.TeacherTimeTableDao;
import com.lrm.dao.impl.BaseDaoImpl;
import com.lrm.entity.Student;
import com.lrm.entity.TeacherTimeTable;
import com.lrm.service.TeacherTimeTableService;

@Service
@Transactional
public class TeacherTimeTableServiceImpl extends BaseDaoImpl<TeacherTimeTable> implements TeacherTimeTableService {

	List<TeacherTimeTable> teaFirstList = null;
	List<TeacherTimeTable> teaSecondList = null;
	List<TeacherTimeTable> teaThirdList = null;
	List<TeacherTimeTable> teaFourthList = null;
	@Resource
	TeacherTimeTableDao teaTimeTableDao;
	
	@Resource
	StudentsDao studentsDao;
	

	public interface couserTimeType {
		final String courseFirst = "第一节";
		final String courseSecond = "第二节";
		final String courseThird = "第三节";
		final String courseforth = "第四节";
	}

	@Override
	public TeacherTimeTable[][] getTeaTimeTableByTeaId(long l) {
		// TODO Auto-generated method stub
		TeacherTimeTable[][] teaTable = new TeacherTimeTable[4][6];
		Iterator<TeacherTimeTable> ite = null;
		System.out.println("老师的ID值为："+l);
		int i=0;//数组列循环次数
		int j=0;//数据行循环次数
		int x=0;//星期循环次数
		
		while (j < 4) {
			if (j == 0) {
				teaFirstList = teaTimeTableDao.teaTimeTableByCourseTime(couserTimeType.courseFirst, l);
				ite = teaFirstList.iterator();
			}
			if (j == 1) {
				teaSecondList = teaTimeTableDao.teaTimeTableByCourseTime(couserTimeType.courseSecond, l);
				ite = teaSecondList.iterator();
			}
			if (j == 2) {
				teaThirdList = teaTimeTableDao.teaTimeTableByCourseTime(couserTimeType.courseThird, l);
				ite = teaThirdList.iterator();
			}
			if (j == 3) {
				teaFourthList = teaTimeTableDao.teaTimeTableByCourseTime(couserTimeType.courseforth, l);
				ite = teaFourthList.iterator();
			}
			while (i < 6) {
				while (ite.hasNext()) {
					
					TeacherTimeTable teatable = ite.next();							
					while(x < 6)
					{
						if ((teatable.getTeaCourseWeek()).equals("星期一")) {
							teaTable[j][x] = teatable;
							System.out.println("星期一课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
						
						if ((teatable.getTeaCourseWeek()).equals("星期二")) {
							teaTable[j][x] = teatable;
							System.out.println("星期二课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
						
						if ((teatable.getTeaCourseWeek()).equals("星期三")) {
							teaTable[j][x] = teatable;
							System.out.println("星期三课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
						
						if ((teatable.getTeaCourseWeek()).equals("星期四")) {
							teaTable[j][x] = teatable;
							System.out.println("星期四课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
						
						if ((teatable.getTeaCourseWeek()).equals("星期五")) {
							teaTable[j][x] = teatable;
							System.out.println("星期五课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
						
						if ((teatable.getTeaCourseWeek()).equals("星期六")) {
							teaTable[j][x] = teatable;
							System.out.println("星期六课的课程名字"+"位置为"+"("+j+","+x+")"+teaTable[j][x].getTeaTableCourse().getCourseName()+"星期为"+teaTable[j][x].getTeaCourseWeek());
							x=0;
							break;
						}else
						{
							x=x+1;
						}
					}	
				   x=0;
				}
				i=i+1;
			}
			i=0;
			j=j+1;
		}
		return teaTable;
	}


	@Override
	public List<TeacherTimeTable> getTeaClassListByTid(long teacherId) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		List<TeacherTimeTable> teaTableClassList = teaTimeTableDao.getTeaTimeTableByTid(teacherId);
		//过滤掉其中重复的班级
		for(i=0; i < teaTableClassList.size(); i++)
		{
			for(j = teaTableClassList.size()-1; j>i; j--)
			{
				if(teaTableClassList.get(i).getTeaSchoolClass().getSoclassName().equals(teaTableClassList.get(j).getTeaSchoolClass().getSoclassName()))
				{
					teaTableClassList.remove(j);
				}
			}
		}
		return teaTableClassList;
	}


	@Override
	public List<Student> getTeaClStudentByCname(String soclassName) {
		// TODO Auto-generated method stub
		 List<Student> studentList = studentsDao.getByClassName(soclassName);
		return studentList;
	}

	
	
}
