package com.opt.java.atm;

import java.util.Scanner;

public class UserService {
int choice;
int balance = 0;
String continueChoice;
String test;

void menu() {
	System.out.println("Type 1 : Check Available Bank Balance");
	System.out.println("Type 2 : Deposit Amount");
	System.out.println("Type 3 : Withdraw Amount");
}

void continueTask() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Do you wish to continue? (y/n) : ");
//	continueChoice = sc.nextLine();
	test = sc.next();
	
//		if (continueChoice.equals("y"))
//		{
//			menu();
//		}
//		else if (continueChoice.equals("n"))
//		{
//			System.out.println("Thanks for Banking with Us !!!");
//		}
}

void service () {
		
	test = "y";
	Scanner sc = new Scanner (System.in);	
	while(test.equals("y")) {
menu();
			
		
		System.out.println("Enter Your Choice : ");
		choice = sc.nextInt();
	
		 
		switch (choice) {
			case 1 :
				System.out.println(" Available Balance : " + balance);

				continueTask();
				break;
				
		
			case 2 :
				System.out.println("Enter Amount :  ");
				int depositAmt = sc.nextInt();  
					
				if (depositAmt < 0) {
						System.out.println("Amount can't be negative");
					}
					
				else {
					System.out.println(depositAmt +" dollar deposited successfully !! \n");
					balance += depositAmt;
					}
				continueTask();
				break;
				
				

			case 3 : {
				System.out.println("Enter Amount : ");
				int withdrawalAmt = sc.nextInt(); 
					
				if (withdrawalAmt > balance) {
					System.out.println("Sorry!! Insufficient balance.");
					}
				
				else {
					System.out.println("Withdrawal successful!");
					balance -= withdrawalAmt;
				}
				continueTask();
				break;
			}
			
		default:
			System.out.println("Choice not available!!! \n");
		
		} //end of switch
	}
	System.out.println("Thanks for Banking with Us !!!");
	System.out.println();
	}
}
