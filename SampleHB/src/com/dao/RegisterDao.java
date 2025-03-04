package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.configuration.hibernateConfig;
import com.entity.Customer;

public class RegisterDao {

	/*	public boolean register(Customer user) {
		SessionFactory factory =hibernateConfig.getSessionFactory();
		Session ss=factory.openSession();
		ss.persist(user);
		ss.beginTransaction().commit();
		return true;
		}*/
	public List<Customer> getCustomerByLocation(String location){
		SessionFactory factory=hibernateConfig.getSessionFactory();
		Session session=factory.openSession();
		String query="SELECT * FROM customer WHERE location = :location";
		NativeQuery<Customer> criteria = session.createNativeQuery(query,Customer.class);
		criteria.setParameter("location", location);
		 return criteria.getResultList();
		
	}
	

}
