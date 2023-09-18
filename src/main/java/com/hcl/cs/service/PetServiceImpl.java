package com.hcl.cs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cs.dao.PetRepo;
import com.hcl.cs.model.Pet;
@Service
public class PetServiceImpl implements PetService {
	@Autowired
	PetRepo petRepo;

	 
	@Override
	public List<Pet> getAllPets() {
		
		return petRepo.findAll();
	}

	/**
	 *
	 */
	@Override
	public List<Pet> petsOfUser(Long uid) {
		
		return petRepo.findByUserId(uid);
	}

	@Override
	public void savePet(Pet pet) {
		petRepo.save(pet);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Pet getPetById(Long id) {
		return petRepo.getById(id);
	}

}
