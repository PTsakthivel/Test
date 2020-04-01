package controller;

import java.util.Scanner;

import pojo.User;
import service.CaseStudyService;
import service.CaseStudyServiceImpl;

public class BankApplicationController {
	private CaseStudyService refCaseStudyService =null;
private User refUser;


	public void bankControllerLogic() {
		refUser = new User();
//		refCaseStudyService= new CaseStudyServiceImpl();
//		refCaseStudyService.useBankApplicaiton(refUser);
	}
	
	public void userInput() {
		bankControllerLogic();
		//refUser = new User();
		refCaseStudyService = new CaseStudyServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		String choice = sc.next();
		if (choice.equals("1")) {
			refCaseStudyService.userRegister(refUser); 
			
		}
		else if (choice.equals("2")) {
			refCaseStudyService.userLogin(refUser);
		}
		else if (choice.equals("3")) {
			refCaseStudyService.userForgetPassword(refUser);
		}
		else if (choice.equals("4")) {
			System.out.println(" Logout Successfully");
			return; 
		}
		
			
	}
	
	public void bankApplicationControllerLogic() {
		//ask user to input
		// assumption user already registerd
		bankControllerLogic();
		refCaseStudyService = new CaseStudyServiceImpl();//down casting
		refCaseStudyService.useBankApplicaiton(refUser);
	}
}
