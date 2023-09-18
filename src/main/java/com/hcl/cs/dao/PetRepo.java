package com.hcl.cs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.cs.model.Pet;
import com.hcl.cs.model.User;
@Repository
public interface PetRepo extends JpaRepository<Pet, Long> {
	@Query(value="select * from pet p where petownerid=?1 order by petname",nativeQuery=true)
	List<Pet> findByUserId(Long uid);

}
