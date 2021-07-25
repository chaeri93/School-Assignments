import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		// TODO Auto-generated constructor stub
		setTitle("채리의 버튼 3개 실행");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 닫으면 프로그램(스윙)도 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ContentPaneEx content = new ContentPaneEx();
		new ContentPaneEx();
	}

}
