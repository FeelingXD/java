import java.util.Arrays;
public class p9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,2,3,4};
		int array2[] = {0,0,0,0};
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println(Arrays.toString(array2));
	}
}