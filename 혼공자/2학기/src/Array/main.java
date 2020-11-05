package Array;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student();
	}
	public static void student() {
		// TODO Auto-generated method stub
		int sum=0;
		int[] student = new int[35];
		
		for(int i=0;i<student.length;i++ ) {
			student[i] = (int)(Math.random()*100); //
			sum +=student[i];
		}
		System.out.println("점수 총합 : "+sum+" 평균 : "+sum/35+" ");
	}
}
