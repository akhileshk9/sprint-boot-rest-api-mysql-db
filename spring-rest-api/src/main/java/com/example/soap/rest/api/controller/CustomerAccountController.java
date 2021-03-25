package com.example.soap.rest.api.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.soap.rest.api.model.Account;
import com.example.soap.rest.api.model.ApiResponse;
import com.example.soap.rest.api.service.CustomerAccountDbService;
import com.example.soap.rest.api.service.CustomerAccountService;

@RestController
public class CustomerAccountController {
	/*
	 * @Autowired private CustomerAccountService customerAccountService;
	 */
	private CustomerAccountDbService customerAccountDbService;
	
	public CustomerAccountController(CustomerAccountDbService customerAccountDbService) {
		this.customerAccountDbService = customerAccountDbService;
	}
	
	@PostMapping(value="/api/v1/customers")
	public ApiResponse addCustomerAccount(@RequestBody Account account) {
		return customerAccountDbService.AddAccount(account);
	}
	
	
	@GetMapping("/api/v1/customers/{customerId}")
	@ResponseBody
	public Account getCustomerAccount(@PathVariable("customerId") String customerId) {
		return customerAccountDbService.getAccount(customerId);
	}
	
	
	@GetMapping("/api/v1/customers")
	@ResponseBody
	public List<Account> getAllCustomerAccounts(){
		return customerAccountDbService.getAllAccounts();
	}

}
