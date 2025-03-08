package com.vti.entity;

import java.time.LocalDate;

public class Group {
	public int id;
	public String name;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;

	// A
	public Group() {

	}

	// B
	public Group(int id, String name, Account creator, Account[] accounts, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	// C
	public Group(int id, String name, Account creator, String[] usernames, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;

		// account
		this.accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			this.accounts = new Account[usernames.length];
		}

		this.createDate = createDate;

	}
}
