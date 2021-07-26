package com.petpeers.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petpeers.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDaoIntf{
    
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveRegistrationDetails(Registration registration) {
		sessionFactory.openSession().save(registration);
	}

}
