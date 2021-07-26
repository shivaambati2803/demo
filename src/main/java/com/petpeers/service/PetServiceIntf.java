package com.petpeers.service;

import java.util.List;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

public interface PetServiceIntf {

	List<Pets> getPetList();

	void savePetDetails(Pets pet);

	List<PetSold> getMyPetSoldList();

	List<Pets> getBuyOrSold(int petId);

	void saveSoldPetDetails(PetSold petSold);

	void updateSoldPet(int getsPetSold);
}
