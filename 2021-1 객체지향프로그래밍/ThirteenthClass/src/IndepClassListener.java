import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame{
	
	public IndepClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("독립클래스로 이벤트 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyListener());//액션이 있으면 btn에 액션을 붙여라 
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}

//독립클래스
class MyListener implements ActionListener{//추상클래스

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b=(JButton)e.getSource();//이벤트 들어오면 닫음
		if(b.getText().equals("Action"))
			b.setText("액션");//액션으로 바꿔라
		else
			b.setText("Action");
	}
	
}