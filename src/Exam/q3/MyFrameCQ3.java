package Exam.q3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrameCQ3 extends JFrame implements ActionListener {
	private JLabel l0 = new JLabel("  Stepper  Application  ");
	private JLabel l1 = new JLabel("Value1 ");
	private JTextField t1 = new JTextField("0", 8);
	String[] list = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	String[] nlist = {"-5","-4","-3","-2","-1","0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private JButton b1 = new JButton("Add");
	private JButton b2 = new JButton("Reset");
	private JComboBox c1 = new JComboBox(list);
	private JComboBox c2 = new JComboBox(nlist);
	private JCheckBox cb1 = new JCheckBox("Negative", false);
	private JPanel p1 = new JPanel();

	public MyFrameCQ3(String s) {
		super(s);
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		Font f = new Font("TimesRoman", Font.BOLD, 20);
		p1.setLayout(new GridLayout(3, 2));
		l0.setFont(f);
		l1.setFont(f);
		content.add(l0);
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		p1.add(c1);
		p1.add(b2);
		p1.add(c2);
		content.add(p1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		content.add(cb1);
		setSize(210, 230);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		Object target = e.getSource();
		cb1.setSelected(false);
		if (target == b1) {
			int v1 = Integer.parseInt(t1.getText());
			int amt = Integer.parseInt((String) c1.getSelectedItem());
			int res = v1 + amt;
			t1.setText("" + res);
			if (res < 0) {
				cb1.setSelected(true);
			} else {
				cb1.setSelected(false);
			}
		}
		if (target == b2) {
			int amt = Integer.parseInt((String) c2.getSelectedItem());
			t1.setText("" + amt);
			if (amt < 0) {
				cb1.setSelected(true);
			} else {
				cb1.setSelected(false);
			}
		}
	}
}

