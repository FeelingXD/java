package ex15;
import java.io.*;
import java.util.*;

public class ex15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/temp/data5.txt");
		
		int ch;
		
		while((ch= fis.read())!=-1)
			fos.write((byte)ch);
		System.out.println();
		
		fis.close();
		fos.close();
		
	}

}
