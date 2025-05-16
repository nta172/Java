import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?characterEncoding=latin1";
		String username = "root";
		String password = "17022003";
		
		// Step 1: Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: get a Database Connection
		Connection connection =  DriverManager.getConnection(url, username, password);
		
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
	}
}
