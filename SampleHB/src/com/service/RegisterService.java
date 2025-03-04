package com.service;

import java.util.List;

import com.dao.RegisterDao;
import com.entity.Customer;

public class RegisterService {

/*	public String register(Customer user) {
		RegisterDao registerdao = new RegisterDao();
		boolean isRegister=registerdao.register(user);
		
		if(isRegister) {
			return "user registration success";
		}
		else {
			return "failed";
		}
		
	}*/

	public List<Customer> getCustomerByLocation(String location) {
		RegisterDao registerDao = new RegisterDao();
		return registerDao.getCustomerByLocation(location);
	}
	

}
