package EX13_03;
import java.awt.*;
import javax.swing.*;

public class EX13_10 {

	static class MyGUI extends JFrame{
		MyGUI(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 4");
			
			this.setLayout(new FlowLayout());
			
			String[] pet = {"고양이","강아지","토끼","코알라","송아지"};
			
			JList list = new JList(pet);
			this.add(list);
			
			setSize(200,200);
			setVisible(true);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGUI();
	}

}
