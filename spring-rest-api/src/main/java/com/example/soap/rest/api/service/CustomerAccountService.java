package com.example.soap.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.soap.rest.api.dao.CustomerAccountDbRepo;
import com.example.soap.rest.api.dao.IAccountDao;
import com.example.soap.rest.api.model.Account;
/*
 * THis is the class which will perform the business related validations, rules, calculations etc..
 * */
@Service
public class CustomerAccountService {
	
	  private IAccountDao accountDao;
	  
	  @Autowired public CustomerAccountService(@Qualifier("customerAccount")
	  IAccountDao customerAccountDao) { accountDao = customerAccountDao;
	  
	  } public String AddAccount(Account account) { return
	  accountDao.addAccount(account); }
	  
	  public Account getAccount(String customerId) { return
	  accountDao.getAccount(customerId); }
	  
	  public List<Account> getAllAccounts(){ return accountDao.getAllAccounts(); }
	 

	
}
