package com.petpeers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petpeers.model.Registration;
import com.petpeers.service.RegistrationSeviceIntf;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationSeviceIntf registrationServiceIntf;
	
	@RequestMapping("/registrationPage")
	public ModelAndView loadRegistrationPage(@ModelAttribute("registration") Registration registration) {
		
		
		return new ModelAndView("Registration");
	}
	
	@RequestMapping("/currentPage")
	public ModelAndView getRegistrationPage(@Validated @ModelAttribute("registration") Registration registration,BindingResult result) {
		
		if(result.hasErrors()) {
			return new ModelAndView("Registration");
		}
		if(registration.getPassword().equals(registration.getCpassword())) {
			registrationServiceIntf.saveRegistrationDetails(registration);
        }
	    else {
		return new ModelAndView("Registration","register","Password and Confim Password Must Be Same");
	  }
	return new ModelAndView("Registration", "register","SuccessFully Registered");

	}

}
