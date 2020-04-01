package service;

import java.util.Scanner;

import dao.BankDAOImpl;
import dao.BankDAOInterface;
import pojo.User;

public class CaseStudyServiceImpl implements CaseStudyService{

	BankDAOInterface refDAO= null;
	User refU =null;
	
	int withdrawAmount;
	String newEmail;
	String password;
	String password2;
	String colour;
	int depositAmount;
	String choice2;

	public CaseStudyServiceImpl(){
		refDAO =new BankDAOImpl();
		
	}
	
	@Override
	public void userRegister(User refUser) {
		//User refU = new User(); 
		
		// Registering email
		System.out.println("Enter email address:");
		Scanner sc = new Scanner(System.in);
		newEmail = sc.nextLine();
		if (!(newEmail.equals("xyz@gmail.com"))) {
			refUser.setUserID(newEmail);
			
			//System.out.println(refUser.getUserID());
		}
		else
		{
			System.out.println("Email already exists");
		}
		
		// Registering Password
		System.out.println("Enter Password : ");
		password =sc.nextLine();
		System.out.println("Re-type Password : ");
		password2 =sc.nextLine();
	if ((password.equals(password2))) {
		refUser.setPassword(password);
	
	}
	else {
		System.out.println("Password doesn't match !");
		System.out.println("Re-type Password : ");
		password2 =sc.nextLine();
		refUser.setPassword(password);
	}
		System.out.println("What is your favorite colour?");
		colour = sc.next();
		refUser.setKey(colour);
		refDAO.register(refUser);
	}
	

	@Override
	public void userLogin(User refUser) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email address:");
		newEmail = sc.nextLine();
		System.out.println("Enter Password : ");
		password =sc.nextLine();
		
		refDAO.login(refUser);
		useBankApplicaiton(refUser); //<--
		
		
	}

	@Override
	public void userForgetPassword(User refUser) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID: ");
		sc.nextLine();
		System.out.println("Enter security key :"); 
		String colour = sc.nextLine();
		
		System.out.println("Enter new Password : ");
		password =sc.nextLine();
		System.out.println("Re-type new Password : ");
		password2 =sc.nextLine();
	
		if ((password.equals(password2))) {
			refUser.setPassword(password);
		}
		else {
			System.out.println("Password doesn't match !");
			System.out.println("Re-type Password : ");
			password2 =sc.nextLine();
			refUser.setPassword(password);
		}
		System.out.println("What is your favorite colour?");
		colour = sc.next();
		refU.setKey(colour);
	
		
		
		
	}

	@Override
	public void useBankApplicaiton(User refUser) {
		// need to call DAOImpl		
		do {
			System.out.println();
			System.out.println("Type 1 : Check account balance");
			System.out.println("Type 2 : Deposit");
			System.out.println("Type 3 : Withdraw");
			System.out.println();
			System.out.println("enter your choice");
			
			Scanner sc = new Scanner(System.in);
			int choice =sc.nextInt();
			
			switch (choice){
			case 1 :
				refDAO.checkBalance();
				break;
				
			case 2://NOT WORKING 31/3/20
				System.out.println("Enter amount");
				depositAmount =sc.nextInt();
				System.out.println();
				
				refUser.setAmount(depositAmount);
				//System.out.println(refUser.getAmount());
				refDAO.deposit(refUser);
				break;
				
			case 3:
				System.out.println("Enter amount");
				withdrawAmount =sc.nextInt();
				//refUser.setAmount(refUser.getAmount()- withdrawAmount);
				refUser.setAmount(withdrawAmount); // overridding the amount e.g if amt 100, withdraw 10. setamt = 10  
				refDAO.withdraw(refUser);
				break;
				
			default: 
				System.out.println("Wrong Choice");
				break;
			} // end of switch

			System.out.println("Wish to continue (y/n) :");
			choice2 = sc.next();
		} while (choice2.equals("y"));
	}
			
			
		
		
		

	@Override
	public void useBankApplicaiton() {
		// TODO Auto-generated method stub
		
	}

}
