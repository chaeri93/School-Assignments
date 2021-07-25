import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumberoneIndep extends JFrame{
	
	JLabel la = new JLabel("r=red y=yellow b=blue");
	
	public NumberoneIndep() {
		// TODO Auto-generated constructor stub
		super("키보드 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListner());
		
		c.setFocusable(true);//키보드할때만 붙여주기
		c.requestFocus();
		
		setSize(250,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberoneIndep();
	}
}

class MyKeyListner extends KeyAdapter{

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		JLabel la =new JLabel();
		Container c = (Container)e.getSource();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		
		switch(e.getKeyChar()) {
		case 'r':
			la.setText("붉은색입니다");
			c.setBackground( Color.RED);
			break;
		case 'y':
			la.setText("노란색입니다");
			c.setBackground( Color.YELLOW);
			break;
		case 'b':
			la.setText("파란색입니다");
			c.setBackground( Color.BLUE);
			break;
		case 'q':
			System.exit(0);//시스테 완전 종료
		default:
			la.setText("r y b 중 하나 입력하세요!");
		}
		super.keyPressed(e);
	}
}
