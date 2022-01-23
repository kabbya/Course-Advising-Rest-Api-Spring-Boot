package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Courses;

// long primary key data type

public interface CourseDao extends JpaRepository<Courses, Long>{

}
