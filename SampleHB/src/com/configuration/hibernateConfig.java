package com.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public final class hibernateConfig {
	private hibernateConfig() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customer.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}

}
