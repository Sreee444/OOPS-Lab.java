import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener {
    JLabel L1;
    JTextField t1;
    JLabel L2;
    JTextField t2;
    JLabel L3;
    JTextField t3;
    JButton b;
     
    public ABC() {
        setLayout(new FlowLayout());
        L1 = new JLabel("Enter First Number: ");
        t1 = new JTextField(20);
        L2 = new JLabel("Enter Second Number: ");
        t2 = new JTextField(20);
        L3 = new JLabel("Result: ");
        t3 = new JTextField(20);
        t3.setEditable(false);
        b = new JButton("ADD");

        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(b);
        add(L3);
        add(t3);
        b.addActionListener(this);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ac) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1 + num2;
            t3.setText(String.valueOf(sum)); 
        } catch (NumberFormatException e) {
            t3.setText("Invalid input. Please enter a number");
        }
    }
}

public class SwingAddition {
    public static void main(String[] args) {
        new ABC();
    }
}
