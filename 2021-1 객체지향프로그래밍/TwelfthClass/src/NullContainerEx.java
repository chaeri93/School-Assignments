import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx() {
		// TODO Auto-generated constructor stub
		setTitle("�����Ӱ� ��ġ�ϴ�, ��ġ������ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("Hello Press Button!");
		la.setLocation(130, 50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for(int i=0;i<=9;i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setLocation(i*15,i*15);
			button.setSize(50,20);
			contentPane.add(button);
		}
		setSize(300,200);//��ü ������
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NullContainerEx();
	}

}
