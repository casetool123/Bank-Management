package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;

import com.example.demo.model.Account;



@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AccountDao accountDao;

	@Override
	public Account openAccount(Account acc) {
	
		return accountDao.save(acc);
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		return "Object deleted..";
	}

	@Override
	public Account allAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}