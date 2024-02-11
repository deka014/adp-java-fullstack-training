package com.deep.jpaAndHibernateLearn.course.sringdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deep.jpaAndHibernateLearn.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	//custom command but the findBy is important
	List<Course> findByInstructor(String Author);
	
}
