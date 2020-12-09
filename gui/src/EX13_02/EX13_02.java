package EX13_02;
import java.awt.*;
import javax.swing.*;
public class EX13_02 {

	static class MyGUI extends JFrame {
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("FlowLayout 연습");
			
			JButton btn5= new JButton("버튼5");
			this.add(btn5);
			
			setSize(256,256);
			setVisible(true);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
