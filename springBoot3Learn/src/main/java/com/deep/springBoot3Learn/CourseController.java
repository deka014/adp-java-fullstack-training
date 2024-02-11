package com.deep.springBoot3Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Courses> getAllCourses(){
		return Arrays.asList(
				new Courses(1,"Java Full Stack Batch 1" , "Jag Bhai"),
				new Courses(3,"Java Full Stack Batch 2" , "Jui Dhora")
				);
	}
}
