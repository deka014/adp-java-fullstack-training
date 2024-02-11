package com.deep.learningSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Student(String name,int age,Batch batch) {};
record Batch(String InstructorName) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Nigger Boro";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Student student() {
		Student student = new Student("Tangudu",25,new Batch("jui dhora"));
		return student;
	} 
	
	@Bean(name="adpbatch")
	@Primary
	public Batch batch() {
		return new Batch("Jag Bhai");
	}
	
	@Bean
	@Qualifier("previousBatch")
	public Batch batch2() {
		return new Batch("Praveen");
	}
	
	@Bean
	@Primary
	public Student studentParams(String name , int age , Batch adpbatch) {
		return new Student(name,age,adpbatch);
	} 
	
	@Bean
	public Student studentAuto(String name , int age , @Qualifier("previousBatch") Batch batchmaybe) {
		return new Student(name,age,batchmaybe);
	} 
}
