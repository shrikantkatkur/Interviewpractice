package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCForSelectQuery {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Sanavi@2610");
		Statement st=con.createStatement();
		String s="SELECT * FROM student";
		ResultSet rs= st.executeQuery(s);//IT WILL RETURN THE DATTA THATS WHY TO STORE IN RESULTSET
		while(rs.next()) {
			int rno=rs.getInt("RollNo");
			String sName=rs.getString("SName");
			String div=rs.getString("division");
			int marks=rs.getInt("Marks");
			System.out.println(rno+" "+sName+"  "+div+" "+marks);
		}
		con.close();
		System.out.println("Query excecuted");

	}

}
