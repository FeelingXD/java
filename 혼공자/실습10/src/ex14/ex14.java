package ex14;
import java.io.*;
import java.util.*;

public class ex14 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw =new FileWriter("C:/Temp/data4.txt");
		String str;
		
		while(!(str=sc.nextLine()).equals(""))
			fw.write(str+"\r\n");
		
		fw.close();
	}

}
