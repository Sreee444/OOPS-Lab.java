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
    JButton a;
    JButton b;
    JButton c;
    JButton d;

    public ABC() {
        setLayout(new FlowLayout());
        L1 = new JLabel("Enter First Number: ");
        t1 = new JTextField(20);
        L2 = new JLabel("Enter Second Number: ");
        t2 = new JTextField(20);
        L3 = new JLabel("Result: ");
        t3 = new JTextField(20);
        t3.setEditable(false);
        a = new JButton("ADD");
        b = new JButton("SUBTRACT");
        c = new JButton("MULTIPLICATION");
        d = new JButton("DIVISION");

        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(a);
        add(b);
        add(c);
        add(d);
        add(L3);
        add(t3);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ac) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            String command = ac.getActionCommand();

            switch (command) {
                case "ADD":
                    t3.setText(String.valueOf(num1 + num2));
                    break;
                case "SUBTRACT":
                    t3.setText(String.valueOf(num1 - num2));
                    break;
                case "MULTIPLICATION":
                    t3.setText(String.valueOf(num1 * num2));
                    break;
                case "DIVISION":
                    if (num2 != 0) {
                        t3.setText(String.valueOf(num1 / num2));
                    } else {
                        t3.setText("Cannot divide by zero");
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            t3.setText("Invalid input. Please enter a number");
        }
    }
}

public class SwingMath {
    public static void main(String[] args) {
        new ABC();
    }
}
