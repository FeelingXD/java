package pack1;

import pack2.*;
public class Truck extends pack2.Car{
	
	Truck() {
		System.out.println("패키지1의 Truck 생성자입니다.");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		
		System.out.println(pack2.Car.CAR_NAME);
	}
}
