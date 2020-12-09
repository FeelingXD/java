package EX13_03;

import java.awt.*;
import javax.swing.*;

public class EX13_06 {
	
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("레이아웃이 없는 창 연습");
			
			this.setLayout(null);
			
			JButton btn1 = new JButton("버튼1");
			btn1.setBounds(50,50,70,60);
			this.add(btn1);
			
			JButton btn2 = new JButton("버튼2");
			btn2.setBounds(80,80,70,60);
			this.add(btn2);
			
			JButton btn3 = new JButton("버튼3");
			btn1.setBounds(110,110,70,60);
			this.add(btn3);
			
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
