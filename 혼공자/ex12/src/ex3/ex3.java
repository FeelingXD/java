package ex3;

class Car{
	Car(){
		System.out.println("슈퍼 클래스 생성자 호출(피라미터 없음)");
	}
	Car(String str){
		System.out.println("슈퍼클래스 생성자호출 =>"+str);
		
	}
}
class Sedan extends Car{ 
	Sedan(){
		super("빨강");
		System.out.println("test");
	}
}
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
	}

}
