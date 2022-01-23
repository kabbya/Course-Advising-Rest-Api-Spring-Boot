package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Courses;
import com.springrest.springrest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@Override
	public List<Courses> getCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Courses getCourse(Long courseId) {
		return courseRepository.getById(courseId);
	}
	
	
	@Override
	public Courses addCourse(Courses courses) {
		courseRepository.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
		courseRepository.save(courses);
		return courses;
	}

	@Override
	public void deleteCourse(Long courseId) {
		Courses entityCourses = courseRepository.getById(courseId);
		courseRepository.delete(entityCourses);		
	}


}
