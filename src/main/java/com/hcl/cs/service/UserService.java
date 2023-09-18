package com.hcl.cs.service;

import com.hcl.cs.model.User;

public interface UserService {
	public boolean checkIfExists(String userName);
	public User saveUser(User user);
	public boolean checkIfPassWordCorrect(User user);
	public User getCompleteUserForLogin(String name);
	public User getUser(Long id);
	public User getUserByName(String name);
}
