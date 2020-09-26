package EX06_12;
import java.util.Scanner;
public class EX06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf("몇 단 ? : ");
		dan = s.nextInt();
		
		for(i=1;i<=9;i++)
		{
			System.out.printf("%d x %d = %d \n",dan,i,dan*i);
		}
	}

}
