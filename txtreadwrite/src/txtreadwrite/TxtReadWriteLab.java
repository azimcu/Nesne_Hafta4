package txtreadwrite;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class TxtReadWriteLab {

	public static void main(String[]args) throws IOException {
	File f =new File("C:\\Users\\azim_\\Desktop\\deneme.txt");
	
	if(!f.exists()) {
		
		f.createNewFile();
	}
	

	//-----------String
	

	ArrayList<String> a=new ArrayList<String>();
	a.add("?");
	a.add("100");
	a.add("Bob Blue");
	a.add("24.98");
	a.add("?");
	a.add("200");
	a.add("Steve Green");
	a.add("-345.67");
	a.add("?");
	a.add("300");
	a.add("Pam White");
	a.add("0.00");
	a.add("?");
	a.add("400");
	a.add("Sam Red");
	a.add("-42.16");
	a.add("?");
	a.add("500");
	a.add("Sue Yellow");
	a.add("224.62");
	a.add("?");
	a.add("^Z");
	
	FileWriter fw=new FileWriter (f,false);
	BufferedWriter bw=new BufferedWriter(fw);
    for(String d:a) {
	    bw.write(d+" ");
	    
    }
	bw.close();
	//---------Okuma---
	FileReader fr=new FileReader(f);
	BufferedReader br=new BufferedReader(fr);
	String line;
	line=br.readLine();
	System.out.print(line);
	
	
	Scanner i=new Scanner(f);
	while(i.hasNext()) {
		System.out.printf("%-10s%3d%n-10s%-10s",i.next(),i.nextInt(),i.next(),i.next());
	}
	

	}

}

