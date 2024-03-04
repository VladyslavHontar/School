package Exam.q2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2C extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Value Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Value ");
	private JTextField t2=new JTextField("0",8);
	private JButton b1=new JButton("Set");private JTextField t3=new JTextField("0",8);
	private JButton b2=new JButton("Increment");private JButton b22=new JButton("Decrement");
	private JButton b3=new JButton("Exit"); private JButton b4=new JButton("Reset");
	private JPanel p1=new JPanel();
	
	private MyData d =new MyData("Attendance",0);
	
	public MyFrame2C(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(b22);
		p1.add(b4);p1.add(b3); 
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this); 
		b22.addActionListener(this); 
		b3.addActionListener(this);   
		b4.addActionListener(this);  
		t1.setText(""+d.readName());
		t2.setText(""+d.readValue());
		setSize(210,230);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	          		int amt=Integer.parseInt(t3.getText());
	          		d.set(amt);
	             	t2.setText(""+d.readValue());
	             }
	 	if (target==b2){
      		d.increment();
         	t2.setText(""+d.readValue());
         }
	 	if (target==b22){
      		d.decrement();
         	t2.setText(""+d.readValue());
         }
	 	if (target==b3){
	 		System.exit(0);
         }
	   if (target==b4){
			d.reset();
         	t2.setText(""+d.readValue());
          }	 	
	 }

}