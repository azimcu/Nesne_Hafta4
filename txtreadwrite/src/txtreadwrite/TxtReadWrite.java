package txtreadwrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class TxtReadWrite {

	public static void main(String[] args) throws IOException{
		File f = new File("‪C:\\Users\\azim_\\Desktop\\deneme2.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		//-------------Dosya Yazma İslemi-----------------
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hasan Huseyin");
		a.add("40");
		String s = "Umit Senturk";
		String yas = "50";
		FileWriter fw = new FileWriter(f, false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s + " " + yas + "\n");
		for(String d:a) {
			bw.write(d + " ");
		}
		bw.write("\nAli Veli " + "100");
		bw.close();
		

	}

}
