package com.deep.jpaAndHibernateLearn.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deep.jpaAndHibernateLearn.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	//	@Autowired
	//persistence context is better as it is more specific
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Course course) {
		em.merge(course);
	}
	
	public Course findById(long id) {
		return em.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = em.find(Course.class, id);
		em.remove(course);
	}
	
}
