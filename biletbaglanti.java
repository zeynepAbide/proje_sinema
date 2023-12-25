package sinema_proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class biletbaglanti {
	static Connection myConn1;
	static Statement myState1;
	static ResultSet myRs1;
	static ResultSet yap1() {
		try {
			myConn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sinemaKayit","root","Z5462");
			myState1=myConn1.createStatement();
			myRs1 = myState1.executeQuery("SELECT * FROM secimler");
			return myRs1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myRs1;
	}
	static void ekle1(String sql_sorgu) throws SQLException {
		myState1.executeUpdate(sql_sorgu);
	}
	static void update1(String sql_sorgu) throws SQLException {
		myState1.executeUpdate(sql_sorgu);
	}
	static ResultSet bul1(String sql) throws SQLException {
		ResultSet myRs1 = null;
		myConn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sinemaKayit","root","Z5462");
		myState1=myConn1.createStatement();
		myRs1 = myState1.executeQuery(sql);
		return myRs1;
	}
}