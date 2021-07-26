package com.petpeers.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.dao.LoginServiceDaoIntf;
import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.Registration;

@Service
@Transactional
public class LoginServiceImpl implements LoginServiceIntf{

	@Autowired
	LoginServiceDaoIntf loginServiceDaoIntf;
	
	public List<Registration> getLoginList(String userName) {
		return loginServiceDaoIntf.getLoginList(userName);
	}
}
