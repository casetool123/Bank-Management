package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

public interface AdminService {
	
	public Account openAccount(Account acc);
	public String deleteAccount(String accid);
	public Account allAccount();
	
	

}
