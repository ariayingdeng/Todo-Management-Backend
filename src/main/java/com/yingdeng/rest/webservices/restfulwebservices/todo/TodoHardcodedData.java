package com.yingdeng.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedData {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "ying", "Retrieve all Todos for a user", new Date(), false));
		todos.add(new Todo(++idCounter, "ying", "Delete a Todo of a user", new Date(), false));
		todos.add(new Todo(++idCounter, "ying", "Edit/Update a Todo", new Date(), false));
		todos.add(new Todo(++idCounter, "ying", "Create a new Todo", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todos.remove(todo)) {
			return todo;
		}
		return null;
		
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo save(Todo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
 
}
