package sec01.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		show_values(arr1,1);
		
	
		double arr2[] = new double[3];
		arr2[0] =0.1;
		arr2[1] =0.2;
		arr2[2] =0.3;
		
		show_values(arr2,2);
		
		String arr3[] = new String[3];
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
	
		show_values(arr3,3);
	}
	public static void show_values(Object array, int ntype){ 
		
		
		if(ntype ==1 ) {
			int[] arr = (int[])array;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		}
		else if(ntype ==2 ) {
			double[] arr =(double[])array;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		else if(ntype ==3) {
			String[] arr=(String[])array;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}
		
	}	

}
