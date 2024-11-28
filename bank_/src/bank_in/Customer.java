package bank_in;

import java.util.Arrays;

public class Customer {
	
	private String name;
	private String cid;
	private Account[] listAccount;
	
	public Customer() {
		super();		 
	}

	public Customer(String name, String cid, Account[] listAccount) {
		super();
		this.name = name;
		this.cid = cid;
		this.listAccount = listAccount;
	}

	
	
	public String getName() {
		return name;
	}

	public String getCid() {
		return cid;
	}

	public Account[] getListAccount() {
		return listAccount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setListAccount(Account[] listAccount) {
		this.listAccount = listAccount;
	}

	@Override
	public String toString() {
		return "Customer name=" + name + ", cid=" + cid + ", listAccount=" + Arrays.toString(listAccount) ;
	}

 


}
