package ex13;

import java.io.*;
public class ex13 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/data3.txt");
		
		int ch;
		
		while((ch = System.in.read())!=13)
			fos.write((byte)ch);
		fos.close();
	}

}
