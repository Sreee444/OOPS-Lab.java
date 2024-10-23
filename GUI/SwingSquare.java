import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener {
    JLabel L1;
    JTextField t1;
    JLabel L2;
    JTextField t2;
    JButton b;
     
    public ABC() {
        setLayout(new FlowLayout());
        L1 = new JLabel("Enter First Number: ");
        t1 = new JTextField(20);
        L2 = new JLabel("Result: ");
        t2 = new JTextField(20);
        t2.setEditable(false);
        b = new JButton("SQUARE");

        add(L1);
        add(t1);
        add(L2);
        add(t2);
        add(b);
        b.addActionListener(this);
        setSize(250, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ac) {
        try {
            int n = Integer.parseInt(t1.getText());
            int sq = n*n;
            t2.setText(String.valueOf(sq)); 
        } catch (NumberFormatException e) {
            t2.setText("Invalid input. Please enter a number");
        }
    }
}

public class SwingSquare {
    public static void main(String[] args) {
        new ABC();
    }
}
