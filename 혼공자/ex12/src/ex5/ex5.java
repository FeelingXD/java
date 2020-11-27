package ex5;


class Car{
	protected String color;
	int speed;
}
class Sedan extends Car{
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void setColor(String color) {
		this.color = color;
	}
}
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
		
		sedan1.setSpeed(300);
		
		System.out.println("승용차 속도 ==>" + sedan1.speed);
	}
}


