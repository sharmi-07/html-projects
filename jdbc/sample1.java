package jdbc;
//import package
import java.sql.*;

public class sample1 {

	public static void main(String[] args) throws SQLException {
	//establish connection
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		
		//create statement
		Statement st = c.createStatement();
		String query = "insert into student (id,name,age) values (3,'jo',27)";
	    st.executeUpdate(query);
		
}
}
 

