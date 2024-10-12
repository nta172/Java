package com.vti.frontend;
import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Program {
	public static void main(String[] args) {
		// Create Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		
		// Create Position
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;
		
		// Create Group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		
		// Create Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "nta1@gmail.com";
		acc1.userName = "nta1";
		acc1.fullName = "Nguyen The Anh 1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.groups = groupAcc1;
		
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "nta2@gmail.com";
		acc2.userName = "nta2";
		acc2.fullName = "Nguyen The Anh 2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.of(2024, 2, 17);
		acc2.groups = new Group[] { group3, group2};
		
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "nta3@gmail.com";
		acc3.userName = "nta3";
		acc3.fullName = "Nguyen The Anh 3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();
		
		// Print
		// Print Account 1
		System.out.println("Thông tin các Account trên hệ thống: ");
		System.out.println("Account 1 : " + "\n" + "ID : " + acc1.id + "\n" + "Email : " + acc1.email + "\n" + "UserName : " 
		+acc1.userName + "\n" + "FullName :" + acc1.fullName + "\n" + "Department : " + acc1.department.name + "\n" 
		+ "Position : " + acc1.position.name + "\n" + "Group : " + acc1.groups[0].name + " and " +acc1.groups[1].name + "\n"
		+ "CreateDate : " + acc1.createDate);
		
		System.out.println("----------------------------------------------");
		
		// Print Account 2	
		System.out.println("Account 2 : " + "\n" + "ID : " + acc2.id + "\n" + "Email : " + acc2.email + "\n" + "UserName : " 
		+acc2.userName + "\n" + "FullName :" + acc2.fullName + "\n" + "Department : " + acc2.department.name + "\n" 
		+ "Position : " + acc2.position.name + "\n" + "Group : " + acc2.groups[0].name + " and " +acc2.groups[1].name + "\n"
		+ "CreateDate : " + acc2.createDate);
		
		System.out.println("----------------------------------------------");
		
		// Print Account 3
		System.out.println("Account 3 : " + "\n" + "ID : " + acc3.id + "\n" + "Email : " + acc3.email + "\n" + "UserName : " 
		+acc3.userName + "\n" + "FullName :" + acc3.fullName + "\n" + "Department : " + acc3.department.name + "\n" 
		+ "Position : " + acc3.position.name + "\n" + "Group : " + "\n" + "CreateDate : " + acc3.createDate);
	}
	
}
