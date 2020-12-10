package com.mct.controller;

/**
 * @author Keith Priddle www.moderncloudtech.com
 * @version 0.1d
 */
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mct.models.Account;
import com.mct.services.AccountServicesImpl;

@RestController
public class AccountController {
 
	private AccountServicesImpl accountServices;
	
	public AccountController(AccountServicesImpl accountServices) {
		super();
		this.accountServices = accountServices;
	}
	
	@GetMapping("/about1")
    public String about() {
		String aboutservice = accountServices.about();
    	//String about = "This is a default template created for SpringFramework without using SpringBoot(Controller)";
    	return aboutservice;
    }
	
	@GetMapping("/details")
	public String details() {
		String details = accountServices.details();
		return details;
	}
	
	
	//@CrossOrigin(origins="http://localhost:8080")
	//@RequestMapping(path="/Account", method=RequestMethod.GET,consumes="application/json", produces="application/json")
	@GetMapping("/Account")
	public ResponseEntity<List<Account>> getAllAccounts(){
		List<Account> accounts = accountServices.getAllAccounts();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
	
	
	 
	 
	//@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/Account", method=RequestMethod.POST,consumes="application/json", produces="application/json")
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		 
		accountServices.createAccount(account);
		return new ResponseEntity<Account>(account, HttpStatus.CREATED);
	}
	
	/*
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/Account/h/{holderid}", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<List<Account>> getByAccountHolder(@PathVariable("holderid") Long holderId){
		List<Account> accounts = this.accountServices.getByAccountHolder(holderId);
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/Account/c/{currency}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Account>> getByCurrency(@PathVariable("currency") String currency){
		
		List<Account> accounts = accountServices.getAccountsByCurrency(currency);
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(path="/Account/list", method=RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Account>> getAccounts(){
		List<Account> accounts = accountServices.getAccounts();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
		
	}*/
	
}
