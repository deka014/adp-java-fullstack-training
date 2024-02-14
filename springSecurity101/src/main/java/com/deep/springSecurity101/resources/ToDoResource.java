package com.deep.springSecurity101.resources;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoResource {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	private static final List<Todo> TODOS_LIS = Arrays.asList(new Todo("deep","learn full stack"),new Todo("kaushal","start coding"));

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos() {
		return TODOS_LIS;
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForSpecifiUser(@PathVariable String username) {
		return TODOS_LIS.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public void createTodoForSpecificUser(@PathVariable String username,@RequestBody Todo todo) {
		logger.info("create {} for {}",todo,username);
	}
  
}

record Todo (String username,String description) {};
