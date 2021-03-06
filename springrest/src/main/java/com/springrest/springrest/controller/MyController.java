package com.springrest.springrest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Courses;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses Application.";
	}
	
	// Get the courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	
	// get a particular course using the course id
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable Long courseId) {
		return this.courseService.getCourse(courseId);
	}
	
	
	// add course
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		return this.courseService.addCourse(courses);
	}
	
	
	// update course
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		return this.courseService.updateCourse(courses);
	}
	
	
	// delete course
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpSession> deleteCourse(@PathVariable Long courseId){
		
		try {
			this.courseService.deleteCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
