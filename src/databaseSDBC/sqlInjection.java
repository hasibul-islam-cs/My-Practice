package databaseSDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class sqlInjection {
	public static Connection connectToDatabase() {
		Connection connection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void main(String[] args){
		
		Connection obj = connectToDatabase();
		Statement statement = null;
		Scanner sc = new Scanner(System.in);
		
		String query;
		while(true) {
			System.out.println("Sql Command:");
			query = sc.nextLine();
			
			if (query.equals("exit"))
				break;
			
			try {
				statement = obj.createStatement();
				statement.executeUpdate(query);
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}