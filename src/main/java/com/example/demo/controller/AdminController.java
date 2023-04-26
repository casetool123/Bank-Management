package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.Branch;
import com.example.demo.model.Loan;
import com.example.demo.service.AdminService;
import com.example.demo.service.BranchService;
import com.example.demo.service.LoanService;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	LoanService loanService;
	
	
//	Account mappings
	
	@GetMapping("/")
	public String home() {
		return "Hello amrita";
	}
	
	@PostMapping("/createAcc")
	public Account saveAccount(@RequestBody Account acc) {
		adminService.openAccount(acc);
		return acc;
	}
	
	@DeleteMapping("/deleteAccount/{accountNo}")
	public String deleteAccount(@PathVariable(name="accountNo") String accountNo) {
		adminService.deleteAccount(accountNo);
		return "Account deleted";
	}
	
//	Branch mapping
	
	@PostMapping("/createBranch")
	public Branch createBranch(@RequestBody Branch branchMaster) {
		branchService.createBranch(branchMaster);
		return branchMaster;
	}
	
	@DeleteMapping("/deleteBranch/{branchId}")
	public String deleteBranch(@PathVariable(name="branchId") String branchId) {
		branchService.deleteBranch(branchId);
		return "Branch deleted.";
	}
	
	@GetMapping("/allBranches")
	public List<Branch> getAllBranches(){
		return branchService.listAllBranch();
	}
	
//  Loan list
	@GetMapping("/allLoans")
	public List<Loan> loanList(){
		return loanService.listLoans();
	}

}
