import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Numberoneanony extends JFrame{
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	
	public Numberoneanony() {
		// TODO Auto-generated constructor stub
		super("Ű���� ���� �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyChar()) {
				case 'r':
					la.setText("�������Դϴ�");
					getContentPane().setBackground( Color.RED);
					break;
				case 'y':
					la.setText("������Դϴ�");
					getContentPane().setBackground( Color.YELLOW);
					break;
				case 'b':
					la.setText("�Ķ����Դϴ�");
					getContentPane().setBackground( Color.BLUE);
					break;
				case 'q':
					System.exit(0);
				default:
					la.setText("r y b �� �ϳ� �Է��ϼ���!");
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
