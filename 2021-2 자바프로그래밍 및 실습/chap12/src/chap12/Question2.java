package chap12;
import java.awt.*;
import javax.swing.*;
 
public class Question2 extends JFrame {
    public Question2() {
        this.setTitle("원을 0.5초 간격으로 이동");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        this.setContentPane(new MyPanel());
        Thread t = new Thread(new thread());
        t.start();
        
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    private class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            int x = (int)(Math.random()*(getWidth()-50));
            int y = (int)(Math.random()*(getHeight()-50));
            
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
    }
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
            }
        }
    }
    
    public static void main(String[] args) {
        new Question2();
    }
}
