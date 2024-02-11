//package com.deep.jpaAndHibernateLearn.course.jdbc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.deep.jpaAndHibernateLearn.course.Course;
//
//@Component
//public class CourseJdbcCommandLineRunner implements CommandLineRunner{
//	
//	@Autowired
//	private CourseJdbcRepository repo;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-g+enerated method stub
//		repo.insert(new Course(1,"Learn Full stack" , "jui dhora"));
//		repo.insert(new Course(2,"RPS" , "Jag bhai"));
//		repo.delete(2);
//		System.out.println(repo.findById(1)); 
//	}
//	
//	
//
//}
