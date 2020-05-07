package sec01.exam01;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {70,70,70,99,81,75};
		int sum2 =add(scores);
		double avg = (double)add(scores)/scores.length;
		System.out.println("ÇÕ°è: "+sum2);
		System.out.println("Æò±Õ:"+avg);
		
		
	}
	public static int add(int[] scores) {
		int sum =0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		
		return sum;
	}

}
