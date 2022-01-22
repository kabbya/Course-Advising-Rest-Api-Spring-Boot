package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
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

}
