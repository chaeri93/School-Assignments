import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pro2 extends JFrame implements ItemListener {
    private JLabel imgLabel =new JLabel();
    private JRadioButton pets[] = new JRadioButton[2];
    private String[] text = {"강아지","고양이"};
    private ImageIcon[] images = {
            new ImageIcon("images/dog.jpeg"),
            new ImageIcon("images/cat.jpeg")
    };
    private JPanel radioJPanel = new JPanel();

    public Pro2(){
        super("동물 고르기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        creatprogram();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(radioJPanel, BorderLayout.NORTH);
        setSize(1000,700);
        setVisible(true);
    }

    private void creatprogram() {
        JMenuBar menuBar = new JMenuBar();
        JMenu screenMenu = new JMenu("배경 색상");
        JMenuItem [] menuItems = new JMenuItem[2];
        String[] itemTitle = {"흰색","검은색"};

        MenuActionListener listners = new MenuActionListener();
        for(int i=0;i<menuItems.length;i++){
            menuItems[i] = new JMenuItem(itemTitle[i]);
            menuItems[i].addActionListener(listners);
            screenMenu.add(menuItems[i]);
        }
        menuBar.add(screenMenu);
        setJMenuBar(menuBar);

        radioJPanel.setBackground(Color.YELLOW);
        ButtonGroup g = new ButtonGroup();
        for (int i=0;i<pets.length;i++){
            pets[i]=new JRadioButton(text[i]);
            g.add(pets[i]);
            radioJPanel.add(pets[i]);
            pets[i].addItemListener(this);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(pets[0].isSelected())imgLabel.setIcon(images[0]);
        else if (pets[1].isSelected())imgLabel.setIcon(images[1]);
    }

    class MenuActionListener  implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            imgLabel.setOpaque(true);
            switch (cmd){
                case "흰색":
                    imgLabel.setBackground(Color.WHITE);
                    break;
                case "검은색":
                    imgLabel.setBackground(Color.BLACK);
                    break;
            }

        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Pro2();
    }
}
