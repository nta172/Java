package backend;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
}
