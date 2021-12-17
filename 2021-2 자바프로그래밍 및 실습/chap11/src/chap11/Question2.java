package chap11;
import java.awt.*;
import javax.swing.*;

public class Question2 extends JFrame{
	
	public Question2() {
		this.setTitle("이미지 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());

		this.setContentPane(new MyPanel());
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			ImageIcon icon = new ImageIcon("images/back.jpg");
			Image img = icon.getImage();
			
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
		}
	}
	
	public static void main(String[] args) {
		new Question2();
	}
}