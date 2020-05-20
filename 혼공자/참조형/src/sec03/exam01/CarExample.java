package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Car car1 = new Car();
			showvalue(car1);
			
			
			Car car2 = new Car("아반떄");
			showvalue(car2);
			
			Car car3 = new Car("소나타 ","은색");
			showvalue(car3); 
			
	}
	public static void showvalue(Car car ) {
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxspeed);
		
	}

}
