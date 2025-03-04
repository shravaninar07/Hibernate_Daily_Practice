package com.controller;

import java.util.List;

import com.entity.Customer;
import com.service.RegisterService;

public class RegisterController {

	/*public String register(Customer user) {
		RegisterService registerservice =new RegisterService();
		return registerservice.register(user);
		
	}*/
	public List<Customer> getCustomerByLocation(String location){
	RegisterService registerService=new RegisterService();
	return registerService.getCustomerByLocation(location);
	
	
	
	}
	

}
