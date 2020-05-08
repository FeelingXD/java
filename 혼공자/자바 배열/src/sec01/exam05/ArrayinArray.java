package sec01.exam05;

public class ArrayinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] engScores=new int[2][];
		engScores[0] = new int [2];
		engScores[1] = new int [3];
		System.out.println("engScores.length:" + engScores.length);
		
		for(int i=0;i<engScores.length;i++)
		{
			for(int j=0;j<engScores[i].length;j++)
			{
				System.out.println(i+" 행"+j+"열 :"+engScores[i][j]);
			}
	  }
	}

}
