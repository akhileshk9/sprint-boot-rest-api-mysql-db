package com.example.soap.rest.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Account {
	private String name;
	@Id
	private String customerId;
	private String dob;
	public Account() {}
	public Account(@JsonProperty("customerName") String name,@JsonProperty("customerId") String customerId,@JsonProperty("dob") String dob) {
		this.name = name;
		this.customerId = customerId;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return dob;
	}
	public void setDOB(String dOB) {
		dob = dOB;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
}
