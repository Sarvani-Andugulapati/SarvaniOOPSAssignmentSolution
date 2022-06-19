package com.sarvani.email.main;
import java.util.Scanner;
import com.sarvani.email.model.*;
import com.sarvani.email.service.CredentialImple;
import com.sarvani.email.service.CredentialService;
public class emailmain {
public  static void main(String[] args) {
		CredentialImple cdi= new CredentialImple();
		Employee emp =new Employee();
		String emailId;
		String fname;
		String lname;
		String password;
		String department;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first name\n");
		fname=sc.nextLine();
		emp.setFirstName(fname);
		System.out.println("Please enter last name\n");
		lname=sc.nextLine();
		emp.setLastName(lname);
		
		System.out.println("Please enter the department from the following:\n"+
		"1. Technical\n"+"2. Admin\n"+"3. Human Resources\n"+"4. Legal\n");
		int ch;	
		ch = sc.nextInt();
			switch(ch) {
		case 1: 
			department="Technical";
			emailId=cdi.generateEmailId(emp,department);
			password=cdi.generatePassword();
			cdi.showCredentials(fname, emailId, password);
			break;
		case 2: 
			department="Admin";
			emailId=cdi.generateEmailId(emp,department);
			password=cdi.generatePassword();
			cdi.showCredentials(fname, emailId, password);
			break;
		case 3: 
			department="Human Resource";
			emailId=cdi.generateEmailId(emp,department);
			password=cdi.generatePassword();
			cdi.showCredentials(fname, emailId, password);
			break;
		case 4: 
			department="Legal";
			emailId=cdi.generateEmailId(emp,department);
			password=cdi.generatePassword();
			cdi.showCredentials(fname, emailId, password);
			break;
			default:
				System.out.println("Please enter the correct choice\n");
				break;
	}}
}
