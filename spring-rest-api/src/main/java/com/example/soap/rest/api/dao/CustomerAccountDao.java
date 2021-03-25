package com.example.soap.rest.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.soap.rest.api.model.Account;
/*
 * This is where we implement the logic to insert the data to DB
 * */
@Repository("customerAccount")
public class CustomerAccountDao implements IAccountDao{
	private List<Account> accountList = new ArrayList<Account>();
	
	@Override
	public String addAccount(Account account) {
		accountList.add(account);
		return "Success";
	}
	
	@Override
	public Account getAccount(String customerId) {
		for(Account a: accountList) {
			if(a.getCustomerId().equalsIgnoreCase(customerId)) {
				return a;
			}
		}
		return null;
	}
	
	@Override
	public List<Account> getAllAccounts(){
		return accountList;
	}
}
