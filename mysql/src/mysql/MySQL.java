package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQL {
	
	static final String DB = "jdbc:mysql://localhost:3306/STUDENT";
	static final String USER = "root";
	static final String PASS = "944705";
	static final String QUERY = "SELECT * FROM REGISTER" + " WHERE SURNAME = 'Ünal'";

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DB,USER,PASS);
		Statement st = con.createStatement();
		System.out.println("Veri tabanina baglanildi");
		
		/*
		 * static final String QUERY = "SELECT * FROM REGISTER";
		 * şeklinde yazdığında alttaki kod verilerin tamamını getiriyor
		 * 
		 * static final String QUERY = "SELECT * FROM REGISTER" + " WHERE ID = 102";
		 * id üzerinden çekiyor
		 * 
		 * static final String QUERY = "SELECT * FROM REGISTER" + " WHERE SURNAME = 'Ünal'";
		 * 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Aramak istediginiz kisinin adi:  ");
		String name = scan.next();
		String sql = "SELECT * FROM REGISTER" + " WHERE NAME = '"+name+"'";
		
		ResultSet rs = st.executeQuery(sql);	//QUERY olurdu normalde
		while(rs.next()) {
			System.out.print("ID : " + rs.getInt("ID"));
			System.out.print(", AGE : " + rs.getInt("AGE"));
			System.out.print(", NAME : " + rs.getString("NAME"));
			System.out.println(", SURNAME : " + rs.getString("SURNAME"));
		}
		rs.close();
		
		/*
		String sql = "INSERT INTO REGISTER VALUES(101,'Azim','Ünal',21)";
		st.executeUpdate(sql);
		String sql3 = "INSERT INTO REGISTER VALUES(102,'Çağrı','Ünal',40)";
		st.executeUpdate(sql3);
		String sql4 = "INSERT INTO REGISTER VALUES(103,'Cem','Şahin',12)";
		st.executeUpdate(sql4);
		String sql5 = "INSERT INTO REGISTER VALUES(104,'Mert','Durmaz',99)";
		st.executeUpdate(sql5);
		*/
		
		//String sql = "CREATE DATABASE STUDENT";
		//st.executeUpdate(sql);
		/*
		String sql2 = "CREATE TABLE REGISTER " + 
		"(ID INTEGER not NULL, " + 
		" NAME VARCHAR(50), " + 
		" SURNAME VARCHAR(50), " + 
		" AGE INTEGER, " +
		" PRIMARY KEY(ID))";
		st.executeUpdate(sql2);
		*/
		
		
	}

}
