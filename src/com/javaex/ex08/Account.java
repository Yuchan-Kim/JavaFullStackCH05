package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account (String accountNo) {
    	this.accountNo = accountNo;
    }

    //Getter/Setter Methods
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
    
    //필요한 메소드 작성
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("출금하려는 금액 보다 보유 하고 있는 금액이 더 적습니다.");
		}else {
			balance -= money;
		}
	}
	
	public void showBalance() {
		System.out.println(balance);
	}

}
