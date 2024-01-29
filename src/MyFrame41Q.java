
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame41Q extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Car Hire ");
	private JLabel l1 = new JLabel("No of Days");
	Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private JComboBox c1 = new JComboBox(list);
	private JLabel l2 = new JLabel("Car type");
	String[] list2 = {"Economy (€50)", "Standard (€70)", "Luxury (€90)"};
	private JComboBox c2 = new JComboBox(list2);
	private JButton b1=new JButton("Get Quote");
	private JTextField t2 =new JTextField("€ 0",8);
	private JPanel p1=new JPanel();
	private  JCheckBox cb1 = new JCheckBox("Insurance (€10 per day)", true);
	private  JCheckBox cb2 = new JCheckBox("Air condition (€5 per day)", true);
	
	public MyFrame41Q(String s){
		super(s);
		Container content=getContentPane();
		this.setResizable(false);
		l2.setForeground(Color.RED);
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,18);
		Font f2=new Font("TimesRoman", Font.BOLD,14);
		p1.setLayout(new GridLayout(3,2));
		l0.setFont(f);  l2.setFont(f2);  l1.setFont(f2);
		content.add(l0);
		p1.add(l1); p1.add(c1);
		p1.add(l2); p1.add(c2);
		p1.add(b1); p1.add(t2);
		content.add(p1);   content.add(cb1);  content.add(cb2);
		b1.addActionListener(this);
		setSize(250,250);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	
	  	// -------------------------------------------------- 
	 	if (target==b1){
	          		int days= (int) c1.getSelectedItem();
					  int res = 0;
					  if (cb1.isSelected()) {
						  if(cb2.isSelected()) {
						  	switch (c2.getSelectedIndex()) {
							  case 0:
								  res = days * (50 + 10 + 5);
								  break;
							  case 1:
								  res = days * (70 + 10 + 5);
								  break;
							  case 2:
								  res = days * (90 + 10 + 5);
								  break;
							  default:
								  break;
						  	}
						  } else {
							  switch (c2.getSelectedIndex()) {
								  case 0:
									  res = days * (50 + 10);
									  break;
								  case 1:
									  res = days * (70 + 10);
									  break;
								  case 2:
									  res = days * (90 + 10);
									  break;
								  default:
									  break;
							  }
						  }
					  } else {
						  if (cb2.isSelected()) {
							  switch (c2.getSelectedIndex()) {
								  case 0:
									  res = days * (50 + 5);
									  break;
								  case 1:
									  res = days * (70 + 5);
									  break;
								  case 2:
									  res = days * (90 + 5);
									  break;
								  default:
									  break;
							  }
						  } else {
							  switch (c2.getSelectedIndex()) {
								  case 0:
									  res = days * 50;
									  break;
								  case 1:
									  res = days * 70;
									  break;
								  case 2:
									  res = days * 90;
									  break;
								  default:
									  break;
							  }
						  }
					  }
			t2.setText("€ "+res);
	             	}
	 	// -----------end b1------------------------------
	 	
	 	
	     }
	 }

