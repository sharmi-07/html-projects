package jdbc;
//import package
import java.sql.*;

public class sample {

	public static void main(String[] args) throws SQLException {
	//establish connection
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		
		//create statement
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
