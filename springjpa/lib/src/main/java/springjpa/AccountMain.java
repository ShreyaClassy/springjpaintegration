package springjpa;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjpa.controller.AccountController;
import com.springjpa.entity.Account;

public class AccountMain {
	
	
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appcontext.xml");
		AccountController controller=context.getBean(AccountController.class);
		
		
//		Account account = new Account();
//		account.setAccno(126);
//		account.setBalance(20000);
//		account.setName("Anaya");
//		account.setOpeningDate(LocalDate.of(2021, 9, 05));
//		controller.addAccount(account);
//		
//		System.out.println("Acc saved");
		
		//fetchbyId
		
//		Account account4=controller.getIt(118);
//		if(account4!=null) {
//			
//			System.out.println("accountNo:"+account4.getAccno()+" "+"Name:"+account4.getName()+" "+"Balance:"+account4.getBalance()+" "+"OpeningDate:"+account4.getOpeningDate());
//			
//		}
//		
//		else {
//			System.out.println("Account doesnt exist");
//		}
//		
		
		
		//update
		Account accountUpdate=new Account();
		accountUpdate.setAccno(120);
		accountUpdate.setBalance(100000);
		accountUpdate.setName("Ram");
		accountUpdate.setOpeningDate(LocalDate.of(2021, 9, 8));
	
		controller.update(accountUpdate);
		
		System.out.println("updated");
		
		//remove
		
		
//		Account accRemove=controller.getIt(122);
//		controller.remAccounts(accRemove.getAccno());
//		System.out.println("Account removed with accno:"+accRemove.getAccno());
//		
//	
		//fetchbyall
		List<Account> accLists=controller.getAllAcc();
		accLists.forEach(x->System.out.println(x.getAccno()+" "+x.getBalance()+" "+x.getName()+" "+x.getOpeningDate()));
	
		
		
		
		
		context.close();
	}

}
