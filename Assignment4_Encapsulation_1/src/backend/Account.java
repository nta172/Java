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

	// getID
	public String getId() {
		return id;
	}

	// getName
	public String getName() {
		return name;
	}

	// getBalance
	public int getBalance() {
		return balance;
	}

	// Credit
	public int credit(int amount) {
		return this.balance += amount;
	}

	// Debit
	public int debit(int amount) {
		return this.balance -= amount;
	}

	public void tranferTo(Account acc, int amount) {
		this.balance -= amount;
		acc.balance += amount;
	}
}
