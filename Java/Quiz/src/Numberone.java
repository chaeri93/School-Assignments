import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Numberone extends JFrame{
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	
	public Numberone() {
		// TODO Auto-generated constructor stub
		super("Ű���� �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListner());

		c.setFocusable(true);//Ű�����Ҷ��� �ٿ��ֱ�
		c.requestFocus();
		
		setSize(250,150);
		setVisible(true);
	}
	
	class MyKeyListner extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
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
				System.exit(0);//�ý��� ���� ����
			default:
				la.setText("r y b �� �ϳ� �Է��ϼ���!");
			}
			super.keyPressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Numberone();

	}

}
