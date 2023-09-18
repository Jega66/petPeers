package com.hcl.cs.service;

import java.util.List;

import com.hcl.cs.model.Pet;


public interface PetService {
	public List<Pet> getAllPets();
	public List<Pet> petsOfUser(Long uid);
	public void savePet(Pet pet);
	public Pet getPetById(Long id);
}
