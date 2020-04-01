package dao;

import pojo.User;


public class BankDAOImpl implements BankDAOInterface {
static int amount=0;
static String id = "";
static String password = ""; 
static String color = "";
	
	@Override
	public void checkBalance() {
		System.out.println("Current Balance :" +amount);
		
	}

	@Override
	public void deposit(User refuser) {// user imput
		amount = refuser.getAmount() + amount;
		System.out.println(amount +" Has been deposited");
	}

	@Override
	public void withdraw(User refuser) {
		amount = refuser.getAmount() - amount; 
		System.out.println("Transaction Successful");
		
	}
	
	@Override
	public void register(User refuser)
	{
		System.out.println( refuser.getKey() + " is your security key in case if you forget your password ");
		System.out.println();
		System.out.println("Registration Successfull !!");
		
	}
	
	@Override
	public void login(User refuser)
	{
		 System.out.println("Login Sucessful!!");
	}

	@Override
	public void forgetPassword(User refuser) {
		System.out.println( refuser.getKey() + " is your security key in case if you forget your password ");
			
	}
	
	

	

}
