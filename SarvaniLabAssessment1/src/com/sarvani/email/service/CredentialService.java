package com.sarvani.email.service;

import com.sarvani.email.model.Employee;

public abstract class CredentialService{

	public abstract String generatePassword();
	
public  abstract String generateEmailId(Employee emp, String department);

public void showCredentials(String fname,String emailId,String password) {
	// TODO Auto-generated method stub
	
}}