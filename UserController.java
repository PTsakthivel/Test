package com.opt.java.atm;

import java.util.Scanner;



public class UserController  {

	void login() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email address:");
		String id = sc.nextLine();
		System.out.println("Enter Password : ");
		String pw = sc.nextLine();
		
		System.out.println();
		System.out.println("Login Successful");
		System.out.println();
		
		
		
	}

	
}
