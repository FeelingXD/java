package EX06_16;
import java.util.Scanner;
public class EX06_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		while(true){
			System.out.printf("더할 첫 번째 수 입력:");
			a =s.nextInt();
			System.out.printf("더할 두 번째 수 입력:");
			b =s.nextInt();
			System.out.printf("%d + %d = %d\n",a,b,a+b);
		}
	}

}
