package pack1;

import pack2.*;
public class Truck extends pack2.Car{
	
	Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		
		System.out.println(pack2.Car.CAR_NAME);
	}
}
