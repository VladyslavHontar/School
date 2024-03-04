package Exam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q1FrameB22 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Stepper  Application  ");
	private JLabel l1 = new JLabel("Value ");
	private JTextField t1=new JTextField("",8);
	private JTextField t4=new JTextField("1",8);
	private JTextField t3=new JTextField("1",8);
	private JButton b1=new JButton("addVal");
	private JButton b2=new JButton("subVal");
	private JLabel l2 = new JLabel("Name ");
	private JTextField t2=new JTextField("0",8);
	private JButton b3=new JButton("print");
	private JButton b4=new JButton("exit");
	
	private JPanel p1=new JPanel();
	
	private Stepper ms = new Stepper(0, "Aqua");
	
	public Q1FrameB22(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(t4);
		p1.add(b3); p1.add(b4);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);
		b3.addActionListener(this);   
		b4.addActionListener(this);  
		refresh();
		setSize(210,230);    setVisible(true);}
	
	public  void  refresh(){
		t1.setText(""+ ms.readValue());
		t2.setText(""+ ms.readName());     
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
	 		        int v=Integer.parseInt(t3.getText());
	          		ms.addValue(v);
	          		refresh();
	             }
	 	if (target==b2){
		        int v=Integer.parseInt(t4.getText());
          		ms.subValue(v);
          		refresh();
         }
	 	if (target==b3){
	        ms.printDetails();
     }
	 	if (target==b4){
	        System.exit(0);
     }
	 }

}