package chap12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class Question5 extends JFrame {
    private Thread tt;
    private JLabel targetLabel;
    private JLabel bulletLabel = new JLabel();
    private JLabel baseLabel = new JLabel();
    
    public Question5() {
        this.setTitle("사격 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        this.setContentPane(new GamePanel());
        
        tt = new Thread(new targetThread());
        tt.start();
        
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    private class GamePanel extends JPanel {
 
        public GamePanel() {
            this.setSize(300, 300);
            this.setLayout(null);
            
            targetLabel = new JLabel(new ImageIcon("images/chicken.jpg"));
            targetLabel.setBounds(0, 0, 50, 50);
            
            bulletLabel.setOpaque(true);
            bulletLabel.setBackground(Color.RED);
            bulletLabel.setBounds(getWidth()/2 - 5, getHeight() - 85, 10, 10);
            
            baseLabel.setOpaque(true);
            baseLabel.setBackground(Color.BLACK);
            baseLabel.setBounds(getWidth()/2 - 20, getHeight() - 75, 40, 40);
            
            add(targetLabel); add(bulletLabel); add(baseLabel);
            
            this.addKeyListener(new KeyAdapter() {
                Thread t = new Thread(new bulletThread());
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyChar() == '\n') {
                        if(t == null || !t.isAlive()) {
                            t = new Thread(new bulletThread());
                            t.start();
                        }
                    }
                }
            });
            
            requestFocus();
            setFocusable(true);
        }
    }
    
    private class bulletThread implements Runnable {
        public void run() {
            while(true) {
                int x = bulletLabel.getX();
                int y = bulletLabel.getY() - 5;
                
                if(y < 0) {
                    bulletLabel.setLocation(getWidth()/2 - 5, getHeight() - 85);
                    break;
                }
                else if((x > targetLabel.getX() && x < targetLabel.getX() + targetLabel.getWidth()) && 
                        (y > targetLabel.getY() && y < targetLabel.getY() + targetLabel.getHeight())) {
                    tt.interrupt();
                    
                    targetLabel.setLocation(0, 0);
                    bulletLabel.setLocation(getWidth()/2 - 5, getHeight() - 85);
                    break;
                }
                else {
                    bulletLabel.setLocation(x, y);
                }
                
                try {
                    Thread.sleep(20);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
    private class targetThread implements Runnable {
        public void run() {
            while(true) {
                int x = targetLabel.getX() + 5;
                int y = targetLabel.getY();
                
                if(x > getWidth()) {
                    x = 0;
                }
                
                targetLabel.setLocation(x, y);
                
                try {
                    Thread.sleep(20);
                }
                catch(InterruptedException e1) {
                    try {
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e2) {}
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Question5();
    }
}
