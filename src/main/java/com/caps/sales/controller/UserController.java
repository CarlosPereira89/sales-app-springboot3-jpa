package com.caps.sales.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caps.sales.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Carlos", "carlos@gmail.com", "22222-2222", "iusiauisa");
		return ResponseEntity.ok().body(user);
	}

}
