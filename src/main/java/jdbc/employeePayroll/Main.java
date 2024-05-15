package jdbc.employeePayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/payroll_service";
		String user = "root";
		String password = "vaibhav";
		
		System.out.println("Welcome to EmployeePayroll - JDBC Program");

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			Connection connection = DriverManager.getConnection(dburl,user,password);
			System.out.println("Connection is Successfull...");
			System.out.println(connection);
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
