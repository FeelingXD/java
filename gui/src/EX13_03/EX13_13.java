package EX13_03;
import java.awt.*;
import javax.swing.*;


public class EX13_13 {
	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 3");
			this.setLayout(new FlowLayout());
			
			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10,10);
			this.add(txt);
			this.add(area);
			
			setSize(200,200);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
