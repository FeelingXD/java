package 실습10;

import java.io.*;
public class ex11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;
		
		while((str=bReader.readLine())!=null)
		{
			System.out.println(str);
		}
	}

}
