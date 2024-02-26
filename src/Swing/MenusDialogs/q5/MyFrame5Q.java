package Swing.MenusDialogs.q5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame5Q extends JFrame implements ActionListener {
	private JLabel l0 = new JLabel("  Increment  Application  ");
	private JLabel l1 = new JLabel("Value1 ");
	private JTextField t1=new JTextField("0",8);
	private JButton b1=new JButton("Incr");
	private JButton b2=new JButton("Decr");
	private JPanel p1=new JPanel();
	private JButton b3 = new JButton("Add");

	JMenuBar mbar = new JMenuBar();
	JMenu options = new JMenu("Options");
	JMenuItem exit = new JMenuItem("Exit");
	
	public MyFrame5Q(String s) {
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		this.setResizable(false);
		p1.setLayout(new GridLayout(3,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(b2); p1.add(b3);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(230,200);    setVisible(true);

		this.setJMenuBar(mbar);
		mbar.add(options);
		options.add(exit);
		exit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
        
	  	Object target=e.getSource();
	 	if (target==b1) {
			int v1=Integer.parseInt(t1.getText());
			v1++;
			t1.setText(""+v1);
		 }
	 	//----------------end of b1-----------------
	 	if (target==b2) {
			int v1=Integer.parseInt(t1.getText());
			if (v1 == 0) {
				JOptionPane.showMessageDialog(this, "Is already 0");
			} else {
				v1--;
				t1.setText("" + v1);
			}
		}
		 if (target == b3) {
			 int v1 = Integer.parseInt(t1.getText());
			 Object[] possibilities = {"1", "2", "3", "4", "5", "6"};
			 String s = (String)JOptionPane.showInputDialog(this, "Enter Value to Add","", JOptionPane.PLAIN_MESSAGE, null, possibilities, "");
		 	int amt = Integer.parseInt(s);
			 int res = v1+amt;
			 t1.setText("" + res);
		 }
		 if (target == exit) {
			 System.exit(0);
		 }
	 	
	}
}

