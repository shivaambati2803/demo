package com.petpeers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.Registration;
import com.petpeers.service.LoginServiceIntf;
import com.petpeers.service.PetServiceIntf;

@Controller
public class LoginController {
	
	@Autowired
	LoginServiceIntf loginServiceIntf;
	@Autowired
	PetServiceIntf petServiceIntf;
	
	@RequestMapping("/loginHome")
	public ModelAndView loadLoginPage(@ModelAttribute("login") Login login) {
		
		return new ModelAndView("Login");
	}
	
	
	@RequestMapping("/loginPage")
	public ModelAndView getLogin(@Validated @ModelAttribute("login") Registration login, BindingResult result) {
		
		if(result.hasErrors()) {
			new ModelAndView("Login");
		}
		String userName = login.getUserName();
	    List<Registration> loginList = loginServiceIntf.getLoginList(userName);
	    
	    if(loginList.size() > 0) {
	    if(login.getUserName().equals(loginList.get(0).getUserName())) {
	    	if(login.getPassword().equals(loginList.get(0).getPassword())) {
	    		    		
	    		return new ModelAndView("redirect:/petHomePage");
	    	}
	    }
	    }
    	return new ModelAndView("Login","invalidLogin","Invalid User Name or Password");

	}
	
	@RequestMapping("/petHomePage")
	public ModelAndView getPetHomePage() {
		
		List<Pets> petList = petServiceIntf.getPetList();
		return new ModelAndView("PetHomePage","listOfPet",petList);
	}
	
	@RequestMapping("/logout")
	public ModelAndView loadLogout() {
		
		return new ModelAndView("Logout","logout","Logout Successfully!!!");
	}

}
