package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Branch;

public interface BranchService {
	public Branch createBranch(Branch branch_Master);
	public String deleteBranch(String branchId);
	public List<Branch> listAllBranch();
}
