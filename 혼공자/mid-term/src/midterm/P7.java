package midterm;

public class P7 {

	public static void main(String[] args) {
		// 문자열 String 에서 byte ,short, int ,long,float ,double, boolean,형태로 변환 
		
		
		String str1 = "11";
		byte value1 = Byte.parseByte(str1);
		
		String str2 = "111";
		short value2 = Short.parseShort(str2);
		
		String str3 = "1111";
		int value3 = Integer.parseInt(str3);
	
		String str4 = "11111";
		long value4 = Long.parseLong(str4);
		
		String str5 = "111.11f";
		float value5 = Float.parseFloat(str5);
		
		String str6 = "1111.111";
		double value6 = Double.parseDouble(str6);
		
		String str7 = "false";
		boolean value7 = Boolean.parseBoolean(str7);
		
		System.out.println(value1 +"\n"+value2+"\n" +value3+"\n" +value4+"\n" +value5+"\n" +value6+"\n" +value7);
	}

}
