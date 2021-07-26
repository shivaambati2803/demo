package com.petpeers.dao;

import java.util.List;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.Registration;

public interface LoginServiceDaoIntf {

	List<Registration> getLoginList(String userName);

}
