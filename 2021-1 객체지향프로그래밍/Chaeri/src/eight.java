import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class eight extends JFrame {
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	public eight() {
		super("8번 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addMouseListener(new MyMouseAdapter());
		la.setSize(80, 20); 
		la.setLocation(100, 80);
		c.add(la);
	
		setSize(320,200);
		setVisible(true);
	}
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void  mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
				la.setText("붉은색입니다");
				
				super.mousePressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new eight();
	}

}
