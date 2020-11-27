package ex9;

abstract class Car{
	int speed =0;
	String color ;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}
class Sedan extends Car{
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}
class Truck extends Car{
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
		sedan1.work();
		Truck truck1 = new Truck();
		truck1.work();
	}

}
