package AWT;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;  
class Btn_clk extends JFrame implements ActionListener{  
TextField tf;  
JLabel l;
Button b;
Btn_clk(){  
  
//create components  
	l=new JLabel();
	l.setBounds(60,150,270,120);
	
   tf=new TextField();  
   tf.setBounds(60,50,170,20);  

   b=new Button("click me");  
  b.setBounds(100,120,80,30);  
  
   //register listener  
   b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf); add(l); 
setSize(300,300);  

setLayout(null);  
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
	
tf.setText("Welcome To java"); 
l.setText("Lable Testing....."); 

} 
public static void main(String args[]){  
new Btn_clk();  
}  
}  