package ex16;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex16 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		int ch;
		
		while((ch=fis.read())!=-1) 
			fos.write((byte)ch);
		
		System.out.println("복사완료");
		fis.close();
		fos.close();
	}

}
