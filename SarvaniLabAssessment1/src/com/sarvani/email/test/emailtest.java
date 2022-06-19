package com.sarvani.email.test;
import java.util.Random;
public class emailtest {
	static int len =8; 
public  static void main(String[] args) {
				String  ALL_CHAR = "!@#$%ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder(len);
				for (int i = 0; i < len; i++)
					sb.append(ALL_CHAR.charAt(rnd.nextInt(ALL_CHAR.length())));
				System.out.println(sb.toString());
}
}
