package com.petpeers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petpeers.model.Pets;
import com.petpeers.model.PetSold;
import com.petpeers.service.PetServiceIntf;

@Controller
public class PetController {
	
	@Autowired
	PetServiceIntf PetServiceIntf;
    
	@RequestMapping("/addPetPage")
	public ModelAndView loadPetPage(@ModelAttribute("petData") Pets pet) {
		
		return new ModelAndView("AddPet");
	}
	
	@RequestMapping("/loadPetPage")
	public ModelAndView addPetDetails(@ModelAttribute("petData") Pets pet,BindingResult result) {
		if(result.hasErrors()) {
			new ModelAndView("AddPet");
		}
		PetServiceIntf.savePetDetails(pet);
		return new ModelAndView("redirect:/fetchPetList");
	}
	
	@RequestMapping("/fetchPetList")
	public ModelAndView fetchPetList() {
		
		List<Pets> petList = PetServiceIntf.getPetList();
		return new ModelAndView("PetHomePage","listOfPet",petList);
	}
	
	@RequestMapping("/myPetPage")
	public ModelAndView loadMyPetPage() {
		
		List<PetSold> myPetSoldList = PetServiceIntf.getMyPetSoldList();
		return new ModelAndView("MyPet","listOfSoldPet",myPetSoldList);
	}
	
	@RequestMapping("/homePage")
	public ModelAndView loadHomePage() {
		return new ModelAndView("redirect:/fetchPetList");
	}
	
	@RequestMapping("/buyOrSold/{petId}")
	public ModelAndView getBuyOrSold(@PathVariable int petId) {
		
		List<Pets> buyOrSold = PetServiceIntf.getBuyOrSold(petId);
		
		PetSold petSold = new PetSold();
		
		petSold.setsPetId(buyOrSold.get(0).getPetId());
		petSold.setSpetName(buyOrSold.get(0).getPetName());
		petSold.setsPetAge(buyOrSold.get(0).getPetAge());
		petSold.setsPetPlace(buyOrSold.get(0).getPetPlace());
		
		if(buyOrSold.get(0).getPetBuyOrSold().toLowerCase().equals("buy")) {
		petSold.setsPetSold("Sold");
		}
		
		PetServiceIntf.saveSoldPetDetails(petSold);
		
		PetServiceIntf.updateSoldPet(petSold.getsPetId());
		
		return new ModelAndView("redirect:/fetchPetList");
	}

}
