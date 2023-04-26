package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BranchDao;
import com.example.demo.model.Branch;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	BranchDao branchDao;
	
	@Override
	public Branch createBranch(Branch branch_Master) {
		// TODO Auto-generated method stub
		return branchDao.save(branch_Master);
	}

	@Override
	public String deleteBranch(String branchId) {
		// TODO Auto-generated method stub
		branchDao.deleteById(branchId);
		return "Branhc deleted";
	}

	@Override
	public List<Branch> listAllBranch() {
		// TODO Auto-generated method stub
		
		return branchDao.findAll();
	}

}

