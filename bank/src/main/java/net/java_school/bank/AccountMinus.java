package net.java_school.bank;

public class AccountMinus extends Account {

	public AccountMinus() {}
	
	public AccountMinus(String name, String accountNo, String kind) {
		super(name, accountNo, kind);
	}
	
	public AccountMinus(String name, String accountNo, long balance, String kind) {
		super(name, accountNo, balance, kind);
	}
	
	@Override
	public void withdraw(long money) {
		balance = balance - money;
	}

}