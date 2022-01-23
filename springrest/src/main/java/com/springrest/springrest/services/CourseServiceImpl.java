package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Courses> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(Long courseId) {
		return courseDao.getById(courseId);
	}
	
	
	@Override
	public Courses addCourse(Courses courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteCourse(Long courseId) {
		Courses entityCourses = courseDao.getById(courseId);
		courseDao.delete(entityCourses);		
	}


	
/* 	 Commented lines are without database connection
	
	
	// Temporary Course List
	List <Courses> listOfCourses;
	
	public CourseServiceImpl() {
		
		listOfCourses = new ArrayList<>();
		listOfCourses.add(new Courses(110,"Introduction to Programming", "This course contains basic of python.") );
		listOfCourses.add(new Courses(111,"Introduction to OOP", "This course contains intermidiate of python.") );
	}
	
	@Override
	public List<Courses> getCourses() {
		return listOfCourses;
	}

	@Override
	public Courses getCourse(Long courseId) {
		Courses c = null; 
		for(Courses iter:listOfCourses) {
			if( iter.getCid()==courseId) {
				c = iter;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Courses addCourse(Courses courses) {
		listOfCourses.add(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
		for(Courses iter:listOfCourses) {
			if( iter.getCid()==courses.getCid()) {
				iter.setDescription(courses.getDescription());
				iter.setTitle(courses.getTitle());
				break;
			}
		}
		return courses;
	}

	@Override
	public void deleteCourse(Long courseId) {
		
		int index=0;
		for(Courses iter:listOfCourses) {
			if( iter.getCid()==courseId) {
				break;
			}
			index++;
		}
		
		listOfCourses.remove(index);
		
	}

*/

}
