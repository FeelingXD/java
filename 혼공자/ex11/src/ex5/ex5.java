package ex5;
class Car{
	private int speed =0;
	public void upSpeed(int value) {
		if(speed + value>200)
			speed=200;
		else
			speed=speed+value;
		System.out.println("현재 속도 =>"+ getSpeed());
	}
	public void downSpeed(int value) {
		if(speed -value<0)
			speed = 0;
		else
			speed=speed-value;
		System.out.println("현재 속도=>"+ getSpeed());
	}
	private int getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}
	
}
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
		
		
	}
}
