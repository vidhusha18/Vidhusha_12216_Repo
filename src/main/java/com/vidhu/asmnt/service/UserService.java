package com.vidhu.asmnt.service;

import java.util.List;

import com.vidhu.asmnt.model.User;

public interface UserService {
	
	public List<User> getAllUser();
	public User getUser(int id);
	public String addUser(User user);
	String updateUser(User user);
	String deleteUser(int bid);
}
