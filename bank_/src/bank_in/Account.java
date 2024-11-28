package bank_in;

 

public class Account {
	private int balance;
	private int number;
	private Transition[] listTransition;
	
	
	
	public Account() {
		super();
	}


	public Account(int balance,int number, Transition[] listTransition) {
		super();
		this.balance = balance;
		this.number = number;
		this.listTransition = listTransition;
	}


	//geter setter
	public long getNumber() {
		return number;
	}
	public Transition[] getListTransition() {
		return listTransition;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setListTransition(Transition[] listTransition) {
		this.listTransition = listTransition;
	}


	@Override
	public String toString() {
		return "Account balance=" + balance + ", number=" + number 
			  ;
	}
	
}
