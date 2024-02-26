package Swing.MenusDialogs.Fottball;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

class MyFrameFootballer extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Footballer  Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField("",8);
	private JLabel l2 = new JLabel("Club ");
	private JTextField t2=new JTextField("0",8);
	

	private JLabel l3 = new JLabel("GamesPlayed");
	private JTextField t3=new JTextField("",8);
	private JLabel l4 = new JLabel("GoalsScored ");
	private JTextField t4=new JTextField("0",8);
	
	private JButton b1=new JButton("GetGoalsPerGames");private JTextField t5=new JTextField("0",8);
	private JButton b2=new JButton("AddGoals");private JTextField t6=new JTextField("0",8);
	private JButton b3=new JButton("StepGames");private JButton b4=new JButton("Exit");
	private JButton b5=new JButton("Next");private JButton b6=new JButton("Prev");
	private JButton b7=new JButton("First");private JButton b8=new JButton("Last");
	private JButton b9=new JButton("clear");private JButton b10=new JButton("Insert");
	private JButton b11=new JButton("update");private JButton b12=new JButton("spare");
	
	String[] list= {"1","2","3","4","5"};
	private JComboBox   cb1=new JComboBox(list);// instead of t6
	private JPanel p1=new JPanel();
	
	private Footballer c =new Footballer("Kane","Spurs", 201, 94);
	
	private ArrayList arr=new ArrayList();
	private int index=0;

	JMenuBar mbar=new JMenuBar();

	JMenu    options= new JMenu("Options");

	JMenuItem reset=new JMenuItem("Reset");
	JMenuItem exit=new JMenuItem("Exit");
	
	public MyFrameFootballer(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(11,2));
		l0.setFont(f);  l1.setFont(f);l2.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(l4); p1.add(t4);
		
		p1.add(b1); p1.add(t5);
		p1.add(b2); p1.add(cb1);  // instead of t6
		p1.add(b3); p1.add(b4); 
		p1.add(b5); p1.add(b6); 
		p1.add(b7); p1.add(b8); 
		p1.add(b9); p1.add(b10); 
		p1.add(b11); p1.add(b12); 
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this);   
		b4.addActionListener(this);  
		b5.addActionListener(this);   
		b6.addActionListener(this);  
		b7.addActionListener(this);   
		b8.addActionListener(this);  
		b9.addActionListener(this);   
		b10.addActionListener(this);  
		b11.addActionListener(this);   
		b12.addActionListener(this);  
		
	       this.setJMenuBar(mbar);
	        mbar.add(options);                           // add Menu to MenuBar
	       options.add(reset);                            //  Add MenuItem to Menu
	       options.add(exit);
	       reset.addActionListener(this);
	       exit.addActionListener(this);  
		
		
	    AddElements();

	    refresh();
		setSize(400,400);    setVisible(true);}
	
	
	public void refresh() {
		c=(Footballer)arr.get(index);

		t1.setText(""+c.getName());
    	t2.setText(""+c.getClub());
		t3.setText(""+c.getGamesPlayed());
    	t4.setText(""+c.getGoalsScored());
	}
	
	public void AddElements() {
		arr.add(new Footballer("Ronaldo","Inter",100,50));
		arr.add(new Footballer("Messi","Barcelona",300,150));
		arr.add(new Footballer("Rashford","United",200,90));
		arr.add(new Footballer("Bale","Spurs",250,190));
		arr.add(new Footballer("Connolly","Brighton",50,10));
		}

	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){
            c=(Footballer)arr.get(index);

	 		double d= c.calculateGoalsPerGames();
	 		double roundedDouble = Math.round(d * 1000.0) / 1000.0;
	 		t5.setText(""+roundedDouble);
	             }
	 	if (target==b2){
	 		//int g=Integer.parseInt(t6.getText());
	 		 c=(Footballer)arr.get(index);
	 		int g=Integer.parseInt((String)cb1.getSelectedItem());
	 		c.addGoalsScored(g);
            refresh();
         }
	 	if (target==b3){
	 		 c=(Footballer)arr.get(index);
      		c.stepGamesPlayed();
      		refresh();
         }
	   if (target==b4){
     		System.exit(0);
          }	 
	 	if (target==reset){
	 		 c=(Footballer)arr.get(index);
      		c.reset();
      		refresh();
         }
	   if (target==exit){
     		System.exit(0);
          }	
	 	if (target==b5){   // next
           if (index<arr.size()-1) index++;
           refresh();     
        }
	   if (target==b6){   // prev
           if (index>0) index--;
           refresh();
         }	
	 	if (target==b7){   // first
	           index=0;
	           refresh();     
	        }
		   if (target==b8){   // last
	          index=arr.size()-1;
	           refresh();
	         }
		   
		 	if (target==b9){   // clear
				t1.setText("");
		    	t2.setText("");
				t3.setText("");
		    	t4.setText("");    
		        }
			   if (target==b10){   // insert
		          String name=t1.getText();
		          String club=t2.getText();
		          int gp=Integer.parseInt(t3.getText());
		          int scored=Integer.parseInt(t4.getText());
		          
		          arr.add(new Footballer(name,club,gp,scored));
		          index=arr.size()-1;
		           refresh();
		         }
		   
			   if (target==b11){   // update
			          String name=t1.getText();
			          String club=t2.getText();
			          int gp=Integer.parseInt(t3.getText());
			          int scored=Integer.parseInt(t4.getText());
			          arr.set(index,new Footballer(name,club,gp,scored));
	
			           refresh();
			         }
		   
		   
		   
		   
		   
	 }

}