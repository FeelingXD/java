package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			int num =(int)(Math.random()*6)+1; //0.0<=x<1.0;
			
			if(num==6) {
				break;
			}
			System.out.println(num);
		}
		System.out.println("���α׷� ����");
	}

}
