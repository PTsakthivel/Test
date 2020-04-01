package dao;

import pojo.User;

public interface BankDAOInterface {
	void checkBalance();
	void deposit(User refuser);
	void withdraw(User refuser);
	void register(User refuser);
	void login(User refuser);
	void forgetPassword(User refuser);
}
