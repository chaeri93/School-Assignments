package chap11;
import java.awt.*;
import javax.swing.*;

public class ThreeColorCircle extends JFrame{

	public ThreeColorCircle() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		
		this.setContentPane(new MyPanel());
		
		this.setSize(200, 200);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillArc(5, 5, getWidth()-10, getHeight()-10, 90, 120);
			g.setColor(Color.BLUE);
			g.fillArc(5, 5, getWidth()-10, getHeight()-10, 210, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(5, 5, getWidth()-10, getHeight()-10, 330, 120);

		}
	}
	
	
	public static void main(String[] args) {
		new ThreeColorCircle();
	}
}