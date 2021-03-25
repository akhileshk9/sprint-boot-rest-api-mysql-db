package com.example.soap.rest.api.dao;

import java.util.List;

import com.example.soap.rest.api.model.Account;

public interface IAccountDao {
	
	public String addAccount(Account account);
	public Account getAccount(String customerId);
	public List<Account> getAllAccounts();

}
