package chap09;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Bonus1 extends JFrame{
	private Font f;
	private int size;
	public Bonus1() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		
		label.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				f = label.getFont();
				size = f.getSize();
				int n = e.getWheelRotation();
				if(n < 0 && size > 10) {
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
				else {
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
			}
		});
		
		c.add(label);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		new Bonus1();
	}
}