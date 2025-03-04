package com.fronted;

import java.util.List;

import com.controller.RegisterController;
import com.entity.Customer;

public class User {

	public static void main(String[] args) {
//		Customer user = new Customer();
		//user.setCustomerName("Priya");
//		user.setMob(9897896786l);
//		user.setLocation("mumbai");
		RegisterController  controller= new RegisterController();
		//String msg=controller.register(user);
        //System.out.println(msg);
	
		List<Customer> msg=controller.getCustomerByLocation("mumbai");
	for(Customer customer:msg)
		System.out.println(customer);	
	}	

}
