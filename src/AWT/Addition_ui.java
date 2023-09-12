package AWT;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;  
class Addition_ui extends JFrame implements ActionListener{  
TextField tf1,tf2;  
JLabel l;
String str1,str2;
Button b,bb;
Addition_ui(){  
	
	super("Addition Program");
//create components  
	str1=new String();
	str2=new String();
	l=new JLabel();
	l.setBounds(200,200,270,120);
    tf1=new TextField();  
    tf1.setBounds(150,80,170,20);  
    tf2=new TextField();  
    tf2.setBounds(150,110,170,20);  

 b=new Button("Add");  
 b.setBounds(180,160,80,30);  
  
//register listener  
 b.addActionListener(this);//passing current instance  
 
 bb=new Button("Substract");  
 bb.setBounds(180,210,80,30);  
  
//register listener  
 bb.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(bb);add(tf1);add(tf2); add(l); 
setSize(500,500);  

Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
int x = (d.width - getSize().width) / 2;
int y = (d.height - getSize().height) / 2;
setLocation(x, y);

setLayout(null);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);  
}  
public void actionPerformed(ActionEvent ae){ 
	
	if(ae.getSource()==b)
	{   
		str1=tf1.getText().toString();
		/*//int num1 = Integer.parseInt ( str1 );
		   float a=Float.parseFloat(str1);
		
		str2=tf2.getText().toString();
		//int num2 = Integer.parseInt ( str2 );
		float b=Float.parseFloat(str2);
	    //tf.setText("Welcome To java"); 
		//int add=num1+num2;
		float ans=a/b;
	    l.setText(""+ans);  */
	   // new Image_Demo(str1);
		data d=new data();
		d.setName(str1);
		System.out.println(d.getName());
		 new Image_Demo(str1);
	    new Image_Demo();
	   // JOptionPane.showMessageDialog(null,"Addition is  "+ans,"ADD",JOptionPane.INFORMATION_MESSAGE);
	}
	else if(ae.getSource()==bb)
	{
		str1=tf1.getText().toString();
		int num1 = Integer.parseInt ( str1 );
		str2=tf2.getText().toString();
		int num2 = Integer.parseInt ( str2 );
	    //tf.setText("Welcome To java"); 
		int add=num1-num2;
	    l.setText(""+add);
	 }
	
}  
public static void main(String args[]){  
new Addition_ui();  
}  
}  