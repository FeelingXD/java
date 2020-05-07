package sec01.exam02;

public class Arraytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {85,74,98}; 
		int sum = 0;
		
		for (int i= 0;i< scores.length;i++)
		{
			System.out.println("score : [" + i + " ]:" + scores[i]);
			sum+=scores[i];
		}
		
		double avg =(double)sum/scores.length;
		System.out.println("ÇÕ°è : "+ sum);
		System.out.println("Æò±Õ : "+ avg);
	}
}
		