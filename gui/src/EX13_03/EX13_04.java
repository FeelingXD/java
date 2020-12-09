package EX13_03;
import java.awt.*;
import javax.swing.*;
public class EX13_04 {
	
	static class MyGUI extends JFrame{
		int i=0;
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 연습");
			
			this.setLayout(new GridLayout(3,3,10,10));
			JButton[] btn = new JButton[9];
			
			for(JButton button : btn) {
				
				btn[i] = new JButton("버튼"+(i+1));
				this.add(btn[i]);
				i++;
			}
			
			setSize(256,256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
