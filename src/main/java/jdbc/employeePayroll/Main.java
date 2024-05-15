package jdbc.employeePayroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
			System.out.println("Connection is Successfull..."+"("+connection+")");
			
			java.sql.Statement statement = connection.createStatement();
			String query = "Select * from employee_payroll;";
			ResultSet resultset = statement.executeQuery(query);
			
			while (resultset.next()){
				System.out.println("-------------------------------------------------");
                System.out.println("Employee ID : "+resultset.getInt(1));
                System.out.println("Employee Name : "+resultset.getString(2));
                System.out.println("Salary : "+resultset.getInt(3));
                System.out.println("Start Date : "+resultset.getDate(4));
                System.out.println("Gender : "+resultset.getString(5));
                System.out.println("Address : "+resultset.getString(6));
                System.out.println("Department : "+resultset.getString(7));
                System.out.println("Phone Number : "+resultset.getDouble(8));
                System.out.println("Basic pay : "+resultset.getDouble(9));
                System.out.println("Deduction : "+resultset.getDouble(10));
                System.out.println("Taxable pay : "+resultset.getDouble(11));
                System.out.println("Income tax : "+resultset.getDouble(12));
                System.out.println("Net pay : "+resultset.getDouble(13));
            }
			
			resultset.close();
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
