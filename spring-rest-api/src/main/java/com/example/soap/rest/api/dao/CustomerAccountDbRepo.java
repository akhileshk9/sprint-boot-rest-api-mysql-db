package com.example.soap.rest.api.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.soap.rest.api.model.Account;
@Repository
public interface CustomerAccountDbRepo extends CrudRepository<Account, String> {
	
}
