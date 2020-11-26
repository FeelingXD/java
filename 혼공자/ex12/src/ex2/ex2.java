package ex2;

class Car{
	Car(){
		System.out.println("슈퍼 클래스 생성자 호출~");
	}
}
class Sedan extends Car{
	Sedan(){
		System.out.println("서브 클래스 호출~");
	}
}
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan();
	}

}
