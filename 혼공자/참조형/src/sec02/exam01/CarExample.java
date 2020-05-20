package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar = new Car();
		//mycar.company = "르노 삼성";
		System.out.println("제작회사 : "+mycar.company);
		System.out.println("차 색 : " +mycar.color);
		System.out.println("차 모델 : " +mycar.model);
		System.out.println("최대 속력 : "+mycar.maxSpeed);
		System.out.println("현재 속도 : "+mycar.speed);
		
		
		
		mycar.speed = 95;
		System.out.println(mycar.speed);
	}

}
