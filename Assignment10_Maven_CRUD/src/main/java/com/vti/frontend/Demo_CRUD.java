package com.vti.frontend;

import java.sql.SQLException;

import com.vti.backend.Department_CRUD;

public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Department_CRUD depCRUD = new Department_CRUD();
		depCRUD.question1();
	}
}
