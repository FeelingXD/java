package ex10;
class Car{
	String color;
	int speed;
	static int count=0;
	
	Car(){
		count++;
	}
}
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + myCar1.count);
		
		Car myCar2 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + myCar1.count);
		
		Car myCar3 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + myCar1.count);
	}

}
