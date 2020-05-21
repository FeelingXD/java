package midterm;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("초등학교 학년에 따른 급식비 계산 프로그램\n");
		System.out.println("학년을 입력하세요 :");

		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();//받은 값을 학년에 대입시킴
		
		switch(grade) {
		case 1 :
			System.out.println("1학년 : 2만원");
			break;
		case 2 :
			System.out.println("2학년 : 2만5천원 ");
			break;
		case 3 :
			System.out.println("3학년 : 3만원 ");
			break;
		case 4 :
			System.out.println("4학년 : 3만5천원 ");
			break;
		case 5 :
			System.out.println("5학년 : 4만원 ");
			break;
		case 6 :
			System.out.println("6학년 : 4만5천원 ");
			break;
		default :
			System.out.println("오류");
			break;
		}
	}//왜 학년에따라 급식비가 다른지 모르겟다 학년마다 다른걸먹나 

}
