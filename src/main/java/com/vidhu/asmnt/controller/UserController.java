package com.vidhu.asmnt.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RestController;

import com.vidhu.asmnt.model.User;

import com.vidhu.asmnt.serviceimpl.UserServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000/")
public class UserController {

	
	UserServiceImpl service;

	public UserController(UserServiceImpl service) {
		super();
		this.service = service;
	}

	@PostMapping
	public String insertUser(@RequestBody User user) {
		String msg = "";
		try {
			service.addUser(user);
			msg = "Success";
		} catch (Exception e) {
			
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public User getUserById(@PathVariable("id") int id) {
		return service.getUser(id);
	}

	@GetMapping("/all")
	public List<User> getUser() {
		return service.getAllUser();
	}

	@PutMapping
	public String updateUser(@RequestBody User user) {
		String msg = "";
		try {
			service.updateUser(user);
			msg = "update Success";
		} catch (Exception e) {
			
			msg = "update Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteUserById(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteUser(id);
			msg = "delete fuccess";
		} catch (Exception e) {
			
			msg = "delete failure";
		}

		return msg;
	}

}
