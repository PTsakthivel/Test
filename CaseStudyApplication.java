package com.optimum.application;

import java.util.Scanner;

import controller.BankApplicationController;

public class CaseStudyApplication {

	
	public static void main(String[] args) {
		BankApplicationController refBankApplicationController =new BankApplicationController();
		 
		
		String choice;
		
		do {
			System.out.println("User Home Page :"); 
			System.out.println("1.Register"); 
			System.out.println("2.Login");
			System.out.println("3.Forgot Password");
			System.out.println("4.Logout (exit)");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			//choice = sc.next();
			refBankApplicationController.userInput();
			//
			System.out.println("Wish to continue (y/n) :");
			choice = sc.next();
		}
		while (choice.equals("y"));
		
	}
	
}
