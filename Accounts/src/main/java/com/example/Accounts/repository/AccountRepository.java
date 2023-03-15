package com.example.Accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Accounts.model.Accounts;

public interface AccountRepository extends CrudRepository<Accounts, Long> {
	Accounts findByCustomerId(int customerId);
}
