package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.Customer;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return userDao.save(customer);
	}

	@Override
	public String deleteCustomer(String custid) {
		// TODO Auto-generated method stub
	   userDao.deleteById(custid);
		return "Customer deleted";
	}

}
