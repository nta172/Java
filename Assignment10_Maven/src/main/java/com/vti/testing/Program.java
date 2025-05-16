package com.vti.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
    	Properties properties = new Properties();
    	properties.load(new FileInputStream("src/main/resource/database.properties"));
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        
        // Register the driver class with DriverManager
        Class.forName(properties.getProperty("driver"));

        // Step 2: get a Database Connection
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Connect success!");

        // Step 3 : Create a statement object
        Statement statement = connection.createStatement();

        // Step 4 : Execute SQL query
        String sql = "SELECT AccountID, Email, Username FROM testing_system_assignment.account";
        ResultSet resultSet = statement.executeQuery(sql);

        // Step 5 : Handling result set
        while (resultSet.next()) {
            int accountId = resultSet.getInt("AccountID");
            String email = resultSet.getString("Email");
            String usernameDB = resultSet.getString("Username");

            System.out.println("AccountID: " + accountId + ", Email: " + email + ", Username: " + usernameDB);
        }

        // Close resources (optional but recommended)
        resultSet.close();
        statement.close();
        connection.close();
    }
}
