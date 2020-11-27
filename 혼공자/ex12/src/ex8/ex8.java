package ex8;
abstract class Car{
	int speed =0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
	
}
class Sedan extends Car{
	
}
class Truck extends Car{
	
}
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1= new Sedan();
		System.out.println("승용차 인스턴스 생성");
		Truck truck1 = new Truck();
		System.out.println("트럭 인스턴스 생성");
	}

}
