package ex11;
interface Car{
	void work();
}
interface Cannon{
	void fire();
}

class Tank implements Car,Cannon{
	public void work() {
		System.out.println("탱크가 앞으로굴러갑니다.");
	}
	public void fire() {
		System.out.println("탱크에서 대포를 발사합니다.");
	}
}
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank1= new Tank();
		tank1.work();
		tank1.fire();
	}

}
