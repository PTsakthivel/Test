package service;

import pojo.User;

public interface CaseStudyService {

	void userRegister(User refUser); 
	void userLogin(User refUser);
	void userForgetPassword(User refUser);
	void useBankApplicaiton();
	void useBankApplicaiton(User refUser);

	
}
