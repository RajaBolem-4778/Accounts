package com.example.Accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accounts.model.Accounts;
import com.example.Accounts.model.Customers;
import com.example.Accounts.repository.AccountRepository;
@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/accounts")
	public Accounts getAccountDetails(@RequestBody Customers customer) {
		Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		return accounts;
	}
}
