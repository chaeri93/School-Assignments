import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Numberoneanony extends JFrame{
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	
	public Numberoneanony() {
		// TODO Auto-generated constructor stub
		super("키보드 예제 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyChar()) {
				case 'r':
					la.setText("붉은색입니다");
					getContentPane().setBackground( Color.RED);
					break;
				case 'y':
					la.setText("노란색입니다");
					getContentPane().setBackground( Color.YELLOW);
					break;
				case 'b':
					la.setText("파란색입니다");
					getContentPane().setBackground( Color.BLUE);
					break;
				case 'q':
					System.exit(0);
				default:
					la.setText("r y b 중 하나 입력하세요!");
				}
				super.keyPressed(e);
			}
		
		});

		c.setFocusable(true);
		c.requestFocus();
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Numberoneanony();

	}

}
