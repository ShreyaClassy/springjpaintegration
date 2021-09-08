package com.springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.springjpa.entity.Account;


@Repository
public class AccountDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Account account) {
		entityManager.persist(account);
	}
	
	public Account fetchAccountById(int accno) {
		
		Account account2=entityManager.find(Account.class, accno);
		return account2;
	}
	
	public void updateAcc(Account account) {
		
		entityManager.merge(account);
	}
	
	public void removeAcc(int accno) {
		
		Account acc=entityManager.find(Account.class, accno);
		entityManager.remove(acc);
	}
	
	public List<Account> getAll(){
		TypedQuery<Account>  query3 = entityManager.createNamedQuery("getAll",Account.class);
		List<Account> acclist = query3.getResultList();
		return acclist;
		
		
		//acclist.forEach(x->System.out.println(x.getAccno()+" "+x.getBalance()+" "+x.getName()));
		
	}
	
	

}
