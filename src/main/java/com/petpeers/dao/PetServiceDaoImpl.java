package com.petpeers.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;

@Repository
public class PetServiceDaoImpl implements PetServiceDaoIntf{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Pets> getPetList() {
		
		Query petList = sessionFactory.openSession().createQuery("from Pets");
		List<Pets> listOfPet = petList.list();
		return listOfPet;
	}
	
	public void savePetDetails(Pets pet) {

	sessionFactory.openSession().save(pet);
	}

	public List<PetSold> getPetSoldList() {
		Query petLst = sessionFactory.openSession().createQuery("from PetSold");
		List<PetSold> petSoldList = petLst.list();
		return petSoldList;
	}

	
	public List<Pets> getBuyOrSold(int petId) {
		Query buySold = sessionFactory.openSession().createQuery("from Pets s where s.petId=:petId");
		     buySold.setParameter("petId", petId);
		List<Pets> listOfPet = buySold.list();
		return listOfPet;
	}

	public void saveSoldPetDetails(PetSold petSold) {
               sessionFactory.openSession().save(petSold);	
	}

	
	public void updateSoldPet(int getsPetSold) {
		Query updateQry = sessionFactory.openSession().createQuery("update Pets p set p.petBuyOrSold=:getsPetSold where p.petId=:petSold");
		updateQry.setParameter("getsPetSold","Sold");
		updateQry.setParameter("petSold",getsPetSold);
		updateQry.executeUpdate();
	}

}
