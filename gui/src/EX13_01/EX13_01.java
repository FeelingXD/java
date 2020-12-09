package EX13_01;
import javax.swing.JFrame;


public class EX13_01 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI ¿¬½À");
			
			setSize(500,500);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
