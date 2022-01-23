package com.springrest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Courses;

// long primary key data type

public interface CourseRepository extends JpaRepository<Courses, Long>{

}
