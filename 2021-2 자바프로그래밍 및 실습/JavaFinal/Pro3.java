import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    private BorderLayout layout = new BorderLayout();
    private JLabel input_text = new JLabel("0", JLabel.RIGHT);
    private JPanel set_btn = new JPanel();
    private GridLayout btn_layout = new GridLayout(4, 4);
    private Input_Btn[] Buttons = new Input_Btn[16];

    private boolean[] four = new boolean[4];
    private int buffer = 0;
    private boolean knock = false;

    Calculator(String title) {
        super(title);
        this.layer();
        this.event();
        this.setSize(400, 300);
        this.setResizable(false);
        this.setVisible(true);

    }

    class Input_Btn extends Button {
        String button;
        Input_Btn(String button) {
            super(button);
            this.button = button;
        }

    }
    private void layer() {

        this.setLayout(layout);
        this.add("North", input_text);
        this.add(set_btn);
        input_text.setFont(new Font("", Font.BOLD, 25));

        set_btn.setLayout(btn_layout);
        String[] numbers = new String[] { "7", "8", "9", "+", "4", "5", "6",

                "-", "1", "2", "3", "*", "0", "AC", "=", "/" };

        for (int i = 0; i < Buttons.length; i++) {
            Buttons[i] = new Input_Btn(numbers[i]);
            set_btn.add(Buttons[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < Buttons.length; i++) {
            if (e.getSource() == Buttons[i]) {
                String bt_label = Buttons[i].getLabel();
                if (bt_label.equals("+")) {
                    result();
                    buffer = Integer.parseInt(input_text.getText());
                    four_swt();
                    four[0] = true;
                    knock = true;// 숫자 입력시 초기화 후 입력하기 위함
                } else if (bt_label.equals("-")) {
                    result();
                    buffer = Integer.parseInt(input_text.getText());
                    four_swt();
                    four[1] = true;
                    knock = true;
                } else if (bt_label.equals("*")) {
                    result();
                    buffer = Integer.parseInt(input_text.getText());
                    four_swt();
                    four[2] = true;
                    knock = true;
                } else if (bt_label.equals("/")) {
                    result();
                    buffer = Integer.parseInt(input_text.getText());
                    four_swt();
                    four[3] = true;
                    knock = true;
                } else if (bt_label.equals("=")) {
                    result();
                } else if (bt_label.equals("AC")){
                    input_text.setText("0");
                    knock = false;

                } else if (Integer.parseInt(bt_label) < 10) {
                    if (input_text.getText() == "0" || knock) {
                        input_text.setText(bt_label);
                        knock = false;
                    } else {
                        input_text.setText(input_text.getText() + bt_label);
                   }
                }

            }

        }

    }


    private void four_swt() {

        for (int i = 0; i < four.length; i++) {
            four[i] = false;
        }
    }

    private void result() {

        for (int j = 0; j < four.length; j++) {
            if (four[j] == true) {
                if (j == 0) {
                    input_text.setText(String.valueOf(buffer
                            + Integer.parseInt(input_text.getText())));
                } else if (j == 1) {
                    input_text.setText(String.valueOf(buffer
                            - Integer.parseInt(input_text.getText())));
                } else if (j == 2) {
                    input_text.setText(String.valueOf(buffer
                            * Integer.parseInt(input_text.getText())));
                } else if (j == 3) {
                    input_text.setText(String.valueOf(buffer
                            / Integer.parseInt(input_text.getText())));
                }
            }
        }
        four_swt();
        knock = true;
    }

    private void event() {
        for (int i = 0; i < Buttons.length; i++) {
            Buttons[i].addActionListener(this);
        }
    }
}



public class Pro3 {

    public static void main(String[] args) {
        new Calculator("Calculater");

    }

}