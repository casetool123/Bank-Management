package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoanDao;
import com.example.demo.model.Loan;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;
	
	@Override
	public List<Loan> listLoans() {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}

}
