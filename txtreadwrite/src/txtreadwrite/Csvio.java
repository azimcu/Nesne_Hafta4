package txtreadwrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Csvio {

	public static void main(String[] args) throws IOException {
		File f = new File("‪C:\\Users\\azim_\\Desktop\\deneme2.csv");
		if(!f.exists()) {
			f.createNewFile();
		}
		//-----cvs yaz-----
		FileWriter fw = new FileWriter(f, false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("M ID;Ad;Soyad;Bakiye\n");
		bw.write("100;Bob;Blue;24.98\n");
		bw.write("200;Steve;Green;-345.95\n");
		bw.write("300;Pam White;0.00\n");
		bw.write("400;Sam Red;-42.16\n");
		bw.write("500;Sue Yellow;224.34\n");
		bw.close();
		Scanner i = new Scanner(f);
		while(i.hasNextLine()) {
			String satir = i.nextLine();
			String[] bol = satir.split(";");
			for(String d:bol) {
				System.out.printf("%-5",d);
			}
		}

	}

}
