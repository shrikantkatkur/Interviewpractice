package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb",""
				+ "","Sanavi@2610");
		//ConnectionString="jdbc:oracle:thin@localhost:1521/pdborc1","hr","hr";
		Statement st=con.createStatement();
		//String s="INSERT INTO student (RollNo,Sname,Marks,division) VALUES (6,'k',47,'E');";
		//String s="UPDATE student SET RollNo=11 WHERE Sname='Shrikant1'";
		String s="DELETE FROM student WHERE division='G'";
		st.execute(s);//.execute only for INSERT,UPDATE and DELETE,Not for Select .excecuteQuery
		con.close();
		System.out.println("Query excecuted");

	}

}
