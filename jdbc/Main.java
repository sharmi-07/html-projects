package jdbc;
//step 1 import package
import java.sql.*;
public class Main {

	public static void main(String[] args)throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Sample";
		String user ="root";
		String pass ="root";
		//establish connection
		Connection c = DriverManager.getConnection(url,user,pass);
		
		//create a statement
		Statement st = c.createStatement();
		String q = "select*from student;";
        ResultSet rs = st.executeQuery(q);
        
		//execute query
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			System.out.println( id+" "+name+" "+age);
		}
		
		

	}

}