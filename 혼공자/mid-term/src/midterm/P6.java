package midterm;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //(byte < short< int <long<float<double);
		
		//1 번
		byte byteValue1 = 1;
		int intValue1 =byteValue1;
		System.out.println(intValue1);
		//2
		char charValue2 = '밥'; //밥의 유니코드 값이 변수로 저장된다.
		int intValue2 = charValue2;
		System.out.println(intValue2);
		//3
		int intValue3 = 3;
		long longValue3 = intValue3;
		System.out.println(longValue3);
		//4
		int intValue4 = 4;
		float floatValue4 = intValue4;
		System.out.println(floatValue4);
		//5
		float flaotValue5 = 5.0f;
		double doubleValue5 = flaotValue5;
		System.out.println(doubleValue5);
	}

}
