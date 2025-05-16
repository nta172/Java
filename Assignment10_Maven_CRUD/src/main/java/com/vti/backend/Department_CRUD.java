package com.vti.backend;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.utils.JdbcUtils;

public class Department_CRUD {
	private JdbcUtils jdbc;
	
	public void question1() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM department";
		ResultSet resultSet1 = jdbc.executeQuery(sql);
		System.out.println("Thông tin Department trên hệ thống : ");
		String leftAlignFormat = "| %-6d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("| DepartmentID | DepartmentName |%n");
		System.out.format("+--------+-----------------------+%n");
		
		while (resultSet1.next()) {
			System.out.format(leftAlignFormat, resultSet1.getInt(1), resultSet1.get(2));
		}
	}
}
