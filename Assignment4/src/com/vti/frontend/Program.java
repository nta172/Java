package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Program {
	public static void main(String[] args) {
		question1();
		question2();
	}

	// Question 1 :

	private static void question1() {
		Department dep = new Department();
		Department dep1 = new Department("Intern");
		System.out.println(dep.id);
		System.out.println(dep1.name);
	}

	// Question 2 :
	private static void question2() {
		Account acc1 = new Account();
		Account acc2 = new Account(1, "nguyenvana@gmail.com", "nguyenvana", "Nguyễn Văn A");

		Position pos3 = new Position();
		Account acc3 = new Account(2, "nguyenvanb@gmail.com", "nguyenvanb", "Nguyễn Văn B", pos3);

		Position pos4 = new Position();
		Account acc4 = new Account(3, "nguyenvanc@gmail.com", "nguyenvanc", "Nguyễn Văn C", pos4,
				LocalDate.of(2025, 2, 22));

		System.out.println(acc1.id);
		System.out.println(acc2.fullName);
		System.out.println(acc3.userName);
		System.out.println(acc4.createDate);
	}
}
