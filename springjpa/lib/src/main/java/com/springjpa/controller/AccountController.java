package com.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springjpa.entity.Account;
import com.springjpa.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	public void addAccount(Account account) {
		accountService.saveAccount(account);
	}
	
	public Account getIt(int accno) {
		Account acc=accountService.getById(accno);
		return acc;
	}
	
	public void update(Account account) {
		
		accountService.updateAccount(account);
	}
	
	public void remAccounts(int accno) {
		Account acc1=accountService.getById(accno);
		accountService.remAcc(acc1.getAccno());
	}
	
	public List<Account> getAllAcc(){
		List<Account>  list2 = accountService.getAllAcc();
	
		return list2;
	}
}
