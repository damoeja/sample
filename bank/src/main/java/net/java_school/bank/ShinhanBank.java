package net.java_school.bank;

import java.util.ArrayList;

public class ShinhanBank implements Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(String name, String accountNo, String kind) 
		throws DuplicateAccountNoException {
		Account account = null;
		account = findAccount(accountNo);
		if (account == null) {
			if (kind.equals(Account.ACCOUNT_NORMAL)) {
				accounts.add(new AccountNormal(name, accountNo, kind));
			} else if (kind.equals(Account.ACCOUNT_MINUS)) {
				accounts.add(new AccountMinus(name, accountNo, kind));
			}
		} else {
			throw new DuplicateAccountNoException("이미 계좌번호가 있습니다.");
		}
	}

	public void addAccount(String name, String accountNo, long balance, String kind)
		throws DuplicateAccountNoException {
		Account account = null;
		account = findAccount(accountNo);
		if (account == null) {
			if (kind.equals(Account.ACCOUNT_NORMAL)) {
				accounts.add(new AccountNormal(name, accountNo, balance, kind));
			} else if (kind.equals(Account.ACCOUNT_MINUS)) {
				accounts.add(new AccountMinus(name, accountNo, balance, kind));
			}
		} else {
			throw new DuplicateAccountNoException("이미 계좌번호가 있습니다.");
		}
	}

	public Account findAccount(String accountNo) {
		Account account = null;
		int totalAccount = accounts.size();
		for (int i = 0; i < totalAccount; i++) {
			if (accountNo.equals(accounts.get(i).getAccountNo())) {
				account = accounts.get(i);
				break;
			}
		}
		return account;
	}
	
	public ArrayList<Account> findAccountByName(String name) {
		ArrayList<Account> matched = new ArrayList<Account>();
		int totalAccount = accounts.size();
		for (int i = 0; i < totalAccount; i++) {
			if (name.equals(accounts.get(i).getName())) {
				matched.add(accounts.get(i));
			}
		}
		return matched;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
}