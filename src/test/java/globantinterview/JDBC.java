package globantinterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("ConnectionString");
		//ConnectionString="jdbc:oracle:thin@localhost:1521/pdborc1","hr","hr";
		Statement st=con.createStatement();
		String s="INSERT INTO users VALUES(102,Shrikant,Katkur)";
		//String s="UPDATE users SET uName=svk WHERE userid=102;
		//String s="DELETE users WHERE userid=102";
		ResultSet result=st.executeQuery(s);
		con.close();

	}

}
