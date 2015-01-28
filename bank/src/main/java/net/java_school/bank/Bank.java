package net.java_school.bank;

import java.util.ArrayList;

public interface Bank {
	
	public void addAccount(String name, String accountNo, String kind) 
		throws DuplicateAccountNoException;

	public void addAccount(String name, String accountNo, long balance, String kind) 
		throws DuplicateAccountNoException;

	public Account findAccount(String accountNo);
	
	public ArrayList<Account> findAccountByName(String name);
	
	public ArrayList<Account> getAccounts();
	
}