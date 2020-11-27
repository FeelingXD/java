package ex10;

import ex9.Sedan;
import ex9.Truck;

interface Car{
	static final int CAR_COUNT = 0;
	abstract void work();
}
class Sedan implements Car{
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}
class Truck implements Car{
	public void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}
}
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
		sedan1.work();
		Truck truck1 = new Truck();
		truck1.work();
	}
	

}
