package EX05_10;
import java.util.Scanner;
public class EX05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch 문 if 문 변경
		Scanner s = new Scanner(System.in);
		int year,check;
		
		System.out.println("출생년도를 입력하세요 .");
		year = s.nextInt();
		
		check=year%12;
		if(check ==0)
		{
			System.out.println("원숭이띠");
		}
		if(check ==1)
		{
			System.out.println("닭띠");
		}
		if(check ==2)
		{
			System.out.println("개띠");
		}
		if(check ==3)
		{
			System.out.println("돼지띠");
		}
		if(check ==4)
		{
			System.out.println("쥐띠");
		}
		if(check ==5)
		{
			System.out.println("소띠");
		}
		if(check ==6)
		{
			System.out.println("호랑이띠");
		}
		if(check ==7)
		{
			System.out.println("토끼띠");
		}
		if(check ==8)
		{
			System.out.println("용띠");
		}
		if(check ==9)
		{
			System.out.println("뱀띠");
		}
		if(check ==10)
		{
			System.out.println("말띠");
		}
		if(check ==11)
		{
			System.out.println("양띠");
		}
		
	}

}
