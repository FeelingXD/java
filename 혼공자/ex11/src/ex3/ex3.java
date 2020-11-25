package ex3;


class Car{
	private String color;
	private int speed;
	
	void setColor(String color ) {
		this.color=color;
	}
	void setSpeed(int speed ) {
		this.speed =speed;
	}
	String getColor() {
		return this.color;
	}
	int getSpeed() {
		return this.speed;
	}
}

public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 =new Car();
		myCar1.setColor("빨강");
		myCar1.setSpeed(60);
		
		
		System.out.println("자동차1의 색상은" +myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed()+"Km 입니다.");
		
	}
}
