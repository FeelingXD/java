import java.util.Arrays;
import java.util.Random;
public class p7 {
	public static void main(String args[])
	{
		int [][]score= new int[2][3];
		Random generator =new Random();
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++)
			{
				score[i][j]=generator.nextInt(10)+1;
			}
		}
		System.out.println(Arrays.deepToString(score));		
	}
}
