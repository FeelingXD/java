package sec01.exam01;

public class StringEqulsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String strval1= "고지민 ";
		String strval2= "고지민 ";
		
		if(strval1==strval2) {
			System.out.println("참조하는 객체가 같음");
			
		}
		else
			System.out.println("참조하는 객체가 다름 ");
		
		if(strval1.equals(strval2)) {
			System.out.println("이 같음 ");
		}
		String strval3= "고지민";
		String strval4= "고지민";
	}
	

}
