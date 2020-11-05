package EX06_동전;
import java.util.Scanner;
public class EX06_동전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("교환할 금액을 입력해주세요");
		int income,leftover; // 교환할돈
		int coin_500,coin_100,coin_50,coin_10;
		income = s.nextInt();
		
		
		
		coin_500= income/500; leftover =income%500;
		coin_100= leftover/100; leftover = leftover%100;
		coin_50= leftover/50; leftover = leftover%50;		
		coin_10= leftover/10; leftover = leftover%10;
		
		System.out.println(income +" 원 교환 동전 500원 :"+coin_500+"개 100원 :"+coin_100 +"개 50 원 :"+coin_50+ "개 10 원 :" +coin_10 +"개 나머지 :" +leftover);
		
	}

}
