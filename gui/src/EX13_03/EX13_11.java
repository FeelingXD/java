package EX13_03;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EX13_11 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 1");
			
			this.setLayout(new FlowLayout());
			JButton btn1 = new JButton("버튼 1");
			btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					btn1.setBackground(Color.red);
				}
			});
			this.add(btn1);
			
			setSize(200,200);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}
}
