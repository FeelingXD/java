package EX13_03;

import java.awt.*;
import javax.swing.*;

public class EX13_05 {

	static class MyGUI extends JFrame{
		
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("CardLayout 연습");
			
			this.setLayout(new CardLayout(10,10));
			
			JButton btn1 = new JButton("버튼1");
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);
			
			setSize(256,256);
			setVisible(true);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

	}
}