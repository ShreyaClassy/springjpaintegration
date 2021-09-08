package com.springjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjpa.dao.AccountDao;
import com.springjpa.entity.Account;

@Service
public class AccountService {
	
	@Autowired
	AccountDao accountDao;
	
	@Transactional
	public void saveAccount(Account account) {
		accountDao.save(account);
	}
	
	public Account getById(int accno) {
		Account account3=accountDao.fetchAccountById(accno);
		return account3;
	}
	
	@Transactional
	public void updateAccount(Account account) {
		
		accountDao.updateAcc(account);
	}
	
	@Transactional
	public void remAcc(int accno) {
		Account acc1=accountDao.fetchAccountById(accno);
		accountDao.removeAcc(acc1.getAccno());
	}
	
	@Transactional
	public List<Account> getAllAcc(){
		List<Account>  list1 = accountDao.getAll();
	
		return list1;
	}
		
	

}
