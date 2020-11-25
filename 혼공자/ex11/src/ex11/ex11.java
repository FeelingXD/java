package ex11;

class Car{
	String color;
	int speed;
	static private int count = 0;
	
	Car(){
		count++;
	}
	static int getCount() {
		return count;
	}
}
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재 생산된 자동차 숫자 =>"+Car.getCount());
		
		
		Car myCar1 = new Car();
		
		System.out.println("현재 생산된 자동차 숫자 =>"+Car.getCount());
	}

}
