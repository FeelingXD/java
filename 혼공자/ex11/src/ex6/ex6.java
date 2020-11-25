package ex6;

class Car{
	private String color;
	private int speed;
	
	Car(){
		color = "빨강";
		speed = 0;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
}
public class ex6 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		System.out.println("자동차 1의 색상은 " + myCar1.getColor() + "이며 현재속도는 "+ myCar1.getSpeed() +"Km 입니다.");
		System.out.println("자동차 2의 색상은 " + myCar2.getColor() + "이며 현재속도는 "+ myCar2.getSpeed() +"Km 입니다.");
	}

}
