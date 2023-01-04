package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginPanel {
	
	static final String DB = "jdbc:mysql://localhost:3306/Login";
	static final String USER = "root";
	static final String PASS = "944705";
	static final String QUERY = "SELECT * FROM Values";


	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(DB,USER,PASS);
		Statement st = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.Kayit ol");
		System.out.println("2.Giris Yap");
		System.out.println("\nLutfen yapmak istediginiz islemi seciniz.");
		int secim = scan.nextInt();
		
		switch(secim) {
		case 1:
			System.out.println("Kayit olma ekranina hosgeldiniz");
			System.out.println("Lutfen kullanici adinizi giriniz: ");
			String nick = scan.next();
			System.out.println("Lutfen sifrenizi giriniz: ");
			int password = scan.nextInt();
			
			String sql = "INSERT INTO Values VALUES('Azim',21)";
			st.executeUpdate(sql);
			String sql3 = "INSERT INTO Values VALUES('Çağrı',40)";
			st.executeUpdate(sql3);
			break;
		case 2:
			
			
			ResultSet rs = st.executeQuery(QUERY);
			while(rs.next()) {
				System.out.print("Nick : " + rs.getInt("NICK"));
				System.out.println(", Password : " + rs.getString("PASSWORD"));
			}
			rs.close();
			
			
			break;
		default:
			System.out.println("Yanlis bir secim yaptiniz");
			break;
		}
		
	}

}
