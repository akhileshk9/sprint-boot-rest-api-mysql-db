package com.example.soap.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soap.rest.api.dao.CustomerAccountDbRepo;
import com.example.soap.rest.api.model.Account;
import com.example.soap.rest.api.model.ApiResponse;

@Service
public class CustomerAccountDbService {

	private CustomerAccountDbRepo customerAccountDbRepo;
	@Autowired
	public CustomerAccountDbService(CustomerAccountDbRepo customerAccountDbRepo) {
		this.customerAccountDbRepo = customerAccountDbRepo;
	}
	
	public ApiResponse AddAccount(Account account) {
		Account r = customerAccountDbRepo.save(account);
		ApiResponse response = new ApiResponse();
		if(r!=null) {
			response.setStatusCode("0");
			response.setStatusDesc("Success");
		}
		else {
			response.setStatusCode("1");
			response.setStatusDesc("Failed");
		}
			return response;
	}
	public Account getAccount(String customerId) {
		Optional<Account> resp = customerAccountDbRepo.findById(customerId);
		
		if(resp.isEmpty()) {
			return new Account();
		}
		return resp.get();
	}
	public List<Account> getAllAccounts(){
		List<Account> resp = (List<Account>) customerAccountDbRepo.findAll();
		
		return resp;
	}
}
