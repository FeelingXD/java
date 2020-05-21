package midterm;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //(byte < short< int <long<float<double);
		
		//1 	허용범위가 클경우
		byte a=1;
		byte b=2;
		int asdf = a+b;
		//1-2
		short shortvalue =3;
		short shortvalue2 =4;
		int resurt1_2 = shortvalue +shortvalue2;
		
		//2		정수타입이 실수타입이 될경우
		long longvalue = 11001L;
		float floatvalue2 = longvalue;
		//2-1 
		long longvalue2_1 = 1234L;
		double double2_1 = longvalue2_1;
		//3 char 타입이 정수타입이 될경우 유니코드에 해당하는 정수값으로 바뀌어 저장된다.
		char charvalue ='A';
		int intvalue = charvalue;
		//3-1 char 의 허용 범위를 감당가능하니 long 형의 변환도 가능
		char charvalue2 ='B';
		long longvalue2 = charvalue2 ;
		//4 실수형도 더큰범위인 double 자동형변환된다
		float floatvalue4 = 3.14f;
		float floatvalue4_1 = 3.1415f;
		double doublevalue4 = floatvalue4 + floatvalue4_1;
	}

}
