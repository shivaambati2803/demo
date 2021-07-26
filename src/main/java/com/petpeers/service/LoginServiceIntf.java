package com.petpeers.service;

import java.util.List;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.Registration;

public interface LoginServiceIntf {

	List<Registration> getLoginList(String userName);
}
