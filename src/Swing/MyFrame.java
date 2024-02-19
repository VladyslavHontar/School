package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements ActionListener{
    private JLabel l0 = new JLabel("  Increment  Application  ");
    private JLabel l1 = new JLabel("Value1 ");
    private JTextField t1=new JTextField("0",8);
    private JButton b1=new JButton("Incr");
    private JButton b2=new JButton("Decr");
    private JButton b3=new JButton("Reset Zero");
    private JButton b4=new JButton("Exit");
    private JPanel p1=new JPanel();

    public MyFrame4(String s){
        super(s);
        Container content=getContentPane();
        content.setLayout(new FlowLayout());
        Font f=new Font("TimesRoman", Font.BOLD,20);
        p1.setLayout(new GridLayout(3,2));
        l0.setFont(f);  l1.setFont(f);
        content.add(l0);
        p1.add(l1); p1.add(t1);
        p1.add(b1); p1.add(b2);
        p1.add(b3); p1.add(b4);
        content.add(p1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setSize(210,200);    setVisible(true);}

    public void actionPerformed(ActionEvent e){

        Object target=e.getSource();
        if (target==b1) {
            int v1=Integer.parseInt(t1.getText());
            v1++;
            t1.setText(""+v1);
            JOptionPane.showMessageDialog(this, "Sum ="+v1);
        } else if (target == b2) {
            int v1=Integer.parseInt(t1.getText());
            if (v1 > 0) {
                v1--;
                t1.setText("" + v1);
                JOptionPane.showMessageDialog(this, "Sum =" + v1);
            } else {
                JOptionPane.showMessageDialog(this, "Already a zero");
            }
        } else if (target == b3) {
            t1.setText("0");
            JOptionPane.showMessageDialog(this, "Value reseted");
        } else {
            System.exit(0);
        }
    }
}

