import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	
	public InnerClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("내부클래스로 이벤트 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());//액션이 있으면 에 액션을 붙여라 
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b=(JButton)e.getSource();//이벤트 들어오면 닫음
				if(b.getText().equals("Action"))
					b.setText("액션");//액션으로 바꿔라
				else
					b.setText("Action");
				//글씨 바뀜
				setTitle(b.getText());
				
			}
		});
		
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);
	}

	/*
	 //내부클래스
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b=(JButton)e.getSource();//이벤트 들어오면 닫음
			if(b.getText().equals("Action"))
				b.setText("액션");//액션으로 바꿔라
			else
				b.setText("Action");
			
			//글씨 바뀜
			InnerClassListener.this.setTitle(b.getText());
			
		}
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
