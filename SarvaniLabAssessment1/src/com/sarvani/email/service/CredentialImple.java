package com.sarvani.email.service;
import com.sarvani.email.model.Employee;
import java.util.Random;
public class CredentialImple extends CredentialService {
	int len =8;
				public String generatePassword() {
					String  ALL_CHAR = "!@#$%ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
					Random rnd = new Random();
					StringBuilder sb = new StringBuilder(len);
					for (int i = 0; i < len; i++)
					sb.append(ALL_CHAR.charAt(rnd.nextInt(ALL_CHAR.length())));
					return ((sb.toString()));
				}
		public String generateEmailId(Employee emp, String department) {
			return (emp.getFirstName()+emp.getLastName()+department+"@"+"sarvani"+".com");
		}
		public void showCredentials(String fname,String emailId,String password) {
			System.out.println("Dear"+fname+" "+"your generated credentials are as follows:\n"+
					"Email--->"+" "+emailId+" \n"+"password--->"+" "+password+" \n");
		}
	}