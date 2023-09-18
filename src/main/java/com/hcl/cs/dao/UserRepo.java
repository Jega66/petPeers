package com.hcl.cs.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hcl.cs.model.User;
@Repository("userRepo")
public interface UserRepo extends JpaRepository<User, Long> {
	
	@SuppressWarnings("unchecked")
	public User save(User user);

	
	
	public Optional<User> findByUserName(String userName);

	
	

}
