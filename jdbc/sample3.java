package jdbc;

import java.sql.*;

//import java package
public class sample3 {

	public static void main(String[] args) throws SQLException  {
		//connection
		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "root");
        String q = "insert into student(id,name,age) values(?,?,?);";
        
        PreparedStatement  ps =  c.prepareStatement(q);
        
        ps.setInt(1,26);
        ps.setString(2,"muthu");
        ps.setInt(3,28);
         int r =ps.executeUpdate();
         if(r>0) {
        	 System.out.println("values are inserted");
         }
         else {
        	 System.out.println("values are not inserted");
         }
	}

}
