package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	public Group[] groups;

	public Account() {

	}

	public Account(int id, String email, String userName, String fullName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;

	}

	public Account(int id, String email, String userName, String fullName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();

	}

	public Account(int id, String email, String userName, String fullName, Position position, LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}

	// Tạo getter và setter
	// ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Username
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	// FullName
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	// Department
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	// Position
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	// CreateDate
	public LocalDate getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	//Groups
	public Group[] getGroups() {
		return groups;
	}
	
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
}
