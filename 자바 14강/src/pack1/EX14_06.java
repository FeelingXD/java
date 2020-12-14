package pack1;

public class EX14_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer s[] = {9,3,7,2,5};
		Integer maxVal, minVal;
		int i,k;
		System.out.print("정렬 전 ==> ");
		for(i=0;i<5;i++)
			System.out.print(s[i]+" ");
		for(i=0;i<4;i++)
			for(k=i;k<5;k++)
			{
				maxVal = Math.max(s[i],s[k]);
				minVal = Math.min(s[i], s[k]);
				s[i] = minVal;
				s[k]= maxVal;
			}
		System.out.print("\n정렬 후 ==> ");
		for(i=0;i<5;i++)
			System.out.print(s[i]+" ");
		
		
	}

}
