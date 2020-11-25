package ex1;

class Car{
	String color;
	int speed;
	void upspeed(int value) {
		speed = speed +value;
	}
	void doomSpeed(int value) {
		speed = speed - value;
	}
}

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 =new Car();
		myCar1.color = "빨강";
		myCar1.speed = 0;	
		
		Car myCar2 = new Car();
		myCar2.color ="파랑";
		myCar2.speed=0;
		
		Car myCar3 = new Car();
		myCar3.color = "노랑";
		myCar3.speed = 0;
		
		myCar1.upspeed(30);
		System.out.println("자동차1의 색상은 "+ myCar1.color +"이며, 현재속도" + myCar1.speed+"km입니다.");
		myCar2.upspeed(60);
		System.out.println("자동차2의 색상은 "+ myCar2.color +"이며, 현재속도" + myCar2.speed+"km입니다.");
		System.out.println("자동차3의 색상은 "+ myCar3.color +"이며, 현재속도" + myCar3.speed+"km입니다.");
	}

}

