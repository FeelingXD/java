package ex12;
import java.io.*;
import java.util.*;
public class ex12 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:/Temp/data2.txt"));
		
		int hap = 0;
		
		while(sc.hasNextLine())
			hap+=sc.nextInt();
		
		System.out.println("합계 : "+hap);
		sc.close();
	}

}
