package AWT;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;  
class Edittext extends JFrame implements ActionListener{  
TextField tf;  
JLabel l;
String str;

Button b;
Edittext(){  
  
//create components  
	str=new String();
	l=new JLabel();
	l.setBounds(160,150,270,120);
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    
b=new Button("click me");  
b.setBounds(100,120,80,30);  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf); add(l); 
setSize(500,500);  

Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
int x = (d.width - getSize().width) / 2;
int y = (d.height - getSize().height) / 2;
setLocation(x, y);

setLayout(null);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){ 
	
	str=tf.getText().toString();
    //tf.setText("Welcome To java"); 
    l.setText(str);  
}  

public static void main(String args[]){  
new Edittext();  
}



}  