package pack1;

public class EX14_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Car{
			String carName;
			
			Car(String carName){
				this.carName = carName;
			}
			public void run() {
				for(int i=0;i<3 ;i++) {
					try {
						Thread.sleep(10);
						System.out.println(carName + " ~~달립니다.");
						
					}catch (Exception e) {
						
					}
				}
			}
		}
		Car car1 = new Car("$자동차 1");
		car1.run();
		
		Car car2= new Car("@자동차 2");
		car2.run();
		
		Car car3 = new Car("*자동차 3");
		car3.run();
		
	}

}
 