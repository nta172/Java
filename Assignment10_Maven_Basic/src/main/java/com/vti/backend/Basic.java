package com.vti.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vti.utils.ScannerUltis;

public class Basic {
	public void question1() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect success!");
	}

	public void question2() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a statement object.
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM position";
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.println("Thông tin Position đang có trên hệ thống: ");
		String leftAlignFormat = "| %-2d | %-21s |%n";
		System.out.format("+--------+-----------------------+%n");
		System.out.format("| ID | PositionName |%n");
		System.out.format("+--------+-----------------------+%n");
		while (resultSet.next()) {
			System.out.format(leftAlignFormat, resultSet.getInt(1), resultSet.getString(2));
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void question3() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a statement object.
		Statement statement = connection.createStatement();

		System.out.println("Tạo Position mới.");
		String sql = "INSERT INTO position (PositionName) VALUES (?);";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		System.out.println("Chọn Position cần tạo 1.Dev, 2.Test, 3.Scrum_Master, 4.PM: ");
		String name = getName();
		preStatement.setString(1, name);
		if (preStatement.executeUpdate() == 1) {
			System.out.println("Tạo thành công.");
			question2();
		} else {
			System.out.println("Đã có lỗi xảy ra.");
		}
	}

	private String getName() {
		while (true) {
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return "Dev";
			case 2:
				return "Test";
			case 3:
				return "Scrum Master";
			case 4:
				return "PM";
			default:
				System.out.println("Nhập lại");
				break;
			}
		}
	}

	public void question4() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a statement object.
		Statement statement = connection.createStatement();

		System.out.println("Update tên của Position: ");
		System.out.println("Danh sách của Position : ");
		question2();
		System.out.println("Chọn ID cần update : ");
		int id = ScannerUltis.inputIntPositive();
		System.out.println("Chọn tên Position cần update : 1.Dev, 2.Test, 3.Scrum_Master, 4.PM");
		String newName = getName();
		String sql = "UPDATE position SET PositionName = ? WHERE (PositionID = ?)";
		PreparedStatement pre4 = connection.prepareStatement(sql);
		pre4.setString(1, newName);
		pre4.setInt(2, id);
		if (pre4.executeUpdate() == 1) {
			System.out.println("Update thành công.");
			question2();
		} else {
			System.out.println("Có lỗi xảy ra.");
		}
	}
	
	public void question5() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Create a statement object.
		Statement statement = connection.createStatement();
		
		System.out.println("Xóa id của Position : ");
		System.out.println("Danh sách của Position : ");
		question2();
		System.out.println("Chọn ID cần Delete : ");
		int id5 = ScannerUltis.inputIntPositive();
		
		String sql = "DELETE FROM position WHERE (PositionID = ?)";
		PreparedStatement pre5 = connection.prepareStatement(sql);
		
		pre5.setInt(1, id5);
		if (pre5.executeUpdate() == 1) {
			System.out.println("Đã xóa thành công.");
			question2();
		}else {
			System.out.println("Có lỗi xảy ra.");
		}
	}
}
