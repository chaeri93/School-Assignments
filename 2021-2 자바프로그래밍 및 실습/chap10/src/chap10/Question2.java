package chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question2 extends JFrame{

	public Question2() {
		this.setTitle("메뉴 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		createMenu();
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu [] menu = new JMenu[4];
		String [] menuName = { "파일", "편집", "보기", "입력" };
		
		for(int i = 0; i < menu.length; i++) {
			menu[i] = new JMenu(menuName[i]);
			mb.add(menu[i]);
			if(menu[i].getText().equals("보기")) {
				menu[i].add(new JMenuItem("화면확대"));
				menu[i].addSeparator();
				menu[i].add(new JMenuItem("쪽윤곽"));
			}
		}
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new Question2();
	}
}