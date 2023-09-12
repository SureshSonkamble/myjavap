package AWT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class btn extends JFrame 
{     
	JButton saveB,btn2,btn3,btn4;
    Label l=new Label();
       
       btn()
	      {
		super("Sample Frame");
		setSize(500,500);
        setLayout(null);
        
        //-------------btn1--------------------
        saveB=new JButton("Save");
        saveB.setBounds(250,250,100,50);//x-axis,y-axix,width,height
        add(saveB); 
        //----------------------------------
       
     /*//-------------btn2--------------------
        btn2=new JButton("Exit");
        btn2.setBounds(10,370,100,50);//x-axis,y-axix,width,height
        add(btn2); 
        //----------------------------------
        */
        /*  //-------------btn2--------------------
        btn4=new JButton("Save");
        btn4.setBounds(10,210,100,50);//x-axis,y-axix,width,height
        add(btn4); 
        //----------------------------------
*/       
       
  		l.setBounds(250,25,80,40);
		l.setText("Text");
		add(l);
		
        //----------------------------------    
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
  public static void main(String args[])throws Exception
  {
	  
      new btn();
  }
}