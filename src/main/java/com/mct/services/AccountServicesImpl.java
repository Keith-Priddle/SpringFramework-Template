package com.mct.services;
/**
 * @author Keith Priddle www.moderncloudtech.com
 * @version 0.1d
 */
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mct.repositories.AccountRepository;
import com.mct.models.Account;


@Service
public class AccountServicesImpl {

	@Autowired
	private AccountRepository accountRepository;
	
	
	public void AccountServices(AccountRepository accountRepository) {
		//super();
		this.accountRepository = accountRepository;
	}
	
	
    public String about() {
    	String about = "********** This is a default template created for SpringFramework without using SpringBoot(Service)";
    	return about;
    }
    
    public String details() {
    	String details = "These are more details about the services";
    	return details;
    }

    
	public List<Account> getAllAccounts(){
		List<Account> accounts = new ArrayList<>();
		this.accountRepository.findAll().forEach(accounts::add);
		return accounts;
	}
	
	//public void setRepo(AccountRepository repo) {
	//	accountRepository =repo;
	//}
	
	
	public Account createAccount(Account account) {
		System.out.println("AccountService");
		
		this.accountRepository.save(account);
		return account;
	}
	
	/*
	 * 
	public List<Account> getByAccountHolder(Long holderId){
		List<Account> accounts = this.accountRepository.getByAccountHolder(holderId);
		return accounts;
	}
	
	@RequestMapping(path="/{accountId}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public Account getAccountById(@PathVariable Long accountId) {
		Account account = this.accountRepository.findById(accountId).get();
		return account;
	}
	
	@RequestMapping(path="/{accountId}", method=RequestMethod.DELETE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteAccountById(@PathVariable Long accountId) {
		this.accountRepository.deleteById(accountId);
		
	}
	

	
	public Account createAccount(Account account) {
		System.out.println("AccountService");
		
		this.accountRepository.save(account);
		return account;
	}
	
	@RequestMapping(path="/{accountId}", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Account updateAccount(@PathVariable Long accountId, @Valid @RequestBody Account update) {
		
		Account account = accountRepository.findById(accountId)
				.orElseThrow(() -> new ResourceNotFoundException());
		
		account.setCurrency(update.getCurrency());
		account.setIban(update.getIban());
		return account;
	}	
	
	public List<Account> getAccountsByCurrency(String currency){
		List<Account> accounts = new ArrayList<>();
		this.accountRepository.findByCurrency(currency).forEach(accounts::add);
		return accounts;
	}
	
	public List<Account> getAccounts(){
		List<Account> accounts = new ArrayList<>();
		this.accountRepository.getAccounts().forEach(accounts::add);
		return accounts;
		
	} */
}

