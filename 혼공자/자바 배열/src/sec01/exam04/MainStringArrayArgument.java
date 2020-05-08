package sec01.exam04;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		if(args.length!=2)
		{
			System.out.println("매개변수는 2개여야 합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 +num2;
		System.out.println(num1 +" +" + num2+ " = "+result );
		//for(int i=0;i<args.length;i++)
		//{
			//System.out.println(args[i]);
		//}
	}

}
