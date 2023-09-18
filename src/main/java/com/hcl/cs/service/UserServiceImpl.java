package com.hcl.cs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hcl.cs.dao.UserRepo;
import com.hcl.cs.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userRepo")
	UserRepo userRepo;

	@Override
	public boolean checkIfExists(String UserName) {
		List<User> user = userRepo.findAll();
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).getUserName().equals(UserName))
				return true;
		}
		return false;

	}

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	
	  @Override public boolean checkIfPassWordCorrect(User user) { Optional<User>
	  lt = userRepo.findByUserName(user.getUserName());
	  
	  User req = lt.get(); if
	  (user.getUserPassword().equals(req.getUserPassword())) return true; return
	  false; }
	 

	
	  @Override public User getCompleteUserForLogin(String name) { Optional<User>
	  lt = userRepo.findByUserName(name);
	  
	  User req = lt.get(); return req; }
	 
	@Override
	public User getUser(Long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User getUserByName(String name) {
		return userRepo.findByUserName(name).get();
	}

}
