package net.java_school.bank;

public abstract class Account {
	private String name;
	private String accountNo;
	protected long balance;
	private String kind;
	
	public static final String ACCOUNT_NORMAL = "normal";
	public static final String ACCOUNT_MINUS = "minus";
	public static final String DEPOSIT = "deposit";
	public static final String WITHDRAW = "withdraw";

	public Account() {}
	
	public Account(String name, String accountNo, String kind) {
		this.name = name;
		this.accountNo = accountNo;
		this.kind = kind;
	}

	public Account(String name, String accountNo, long balance, String kind) {
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		this.kind = kind;
	}
	
	public void deposit(long money) {
		balance = balance + money;
	}
	
	public abstract void withdraw(long money) throws LackOfBalanceException;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(accountNo);		
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(balance);
		sb.append("|");
		sb.append(kind);
		
		return sb.toString();
	}
	
}