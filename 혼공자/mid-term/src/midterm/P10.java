package midterm;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//복합 대입 연산자 ^= 비트를 비교하고 XOR 연산을함/ %= 왼쪽값에 오른쪽값으로 나눈 나머지를 대입/ &= 비트를 비교하고 AND연산을함 /
		//^= 의경우 XOR 연산을함 XOR연산은 같은 값일때 0을 반환하고 다른값일때 1을 반환
		int x,y;
		x=4;//100;(2진수표기)
		y=6;//110;
		x^=y;//010 =2 
		System.out.println(x);
		x=25;
		y=4; 
		x%=y; //25를 4로나눈 나머지를 x 에 넣음 25를 4로나누면 몫은 6이고 나머지가 1 x==1;
		System.out.println(x);
		x=4;//100;
		y=6;//110;
		x&=y;//100; => 4 둘다 1이여야 1반환하는 AND연산
		System.out.println(x);
		
	}

}
