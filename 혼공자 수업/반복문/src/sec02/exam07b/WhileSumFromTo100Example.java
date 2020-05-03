package sec02.exam07b;

public class WhileSumFromTo100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum =0;
		
		long i =0;
		int count =1;
		while(i<10000000000000000L) {
			sum+=i;
			
			
			if(i%100000000L== 0) {
				System.out.println(count);
				count++;
			}
			
			if(count>=20)
			{
				break;
			}
			i++;
		}
		System.out.println(sum);
	}

}
