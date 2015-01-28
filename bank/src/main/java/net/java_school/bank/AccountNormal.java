package net.java_school.bank;

import net.java_school.bank.LackOfBalanceException;

public class AccountNormal extends Account {

	public AccountNormal() {}
	
	public AccountNormal(String name, String accountNo, String kind) {
		super(name, accountNo, kind);
	}
	
	public AccountNormal(String name, String accountNo, long balance, String kind) {
		super(name, accountNo, balance, kind);
	}
	
	@Override
	public void withdraw(long money) throws LackOfBalanceException {
		if (money > balance) {
			throw new LackOfBalanceException("잔고가 부족합니다.");
		}
		balance = balance - money;
	}

}