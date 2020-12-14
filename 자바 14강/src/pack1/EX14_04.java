package pack1;
import pack2.Car;
public class Truck extends Car{
	Truck(){
		System.out.println("패키지1의 Truck 생성자입니다.");
	}
}
public class EX14_04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}

}
