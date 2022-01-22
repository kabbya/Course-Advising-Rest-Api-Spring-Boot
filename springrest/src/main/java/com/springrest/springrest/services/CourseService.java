package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();

	public Courses getCourse(Long courseId);

	public Courses addCourse(Courses courses);

	public Courses updateCourse(Courses courses);

	public void deleteCourse(Long courseId);
}
