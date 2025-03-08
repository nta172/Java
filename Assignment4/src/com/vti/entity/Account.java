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
	
	public Account(){
		
	}
	
	public Account(int id, String email, String userName, String fullName){
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		
	}
	
	public Account(int id, String email, String userName, String fullName, Position position){
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
		
	}
	
	public Account(int id, String email, String userName, String fullName, Position position , LocalDate createDate){
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}
	
}
 