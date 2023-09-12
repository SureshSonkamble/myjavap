package AWT;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Image_Demo extends JFrame
{
	
	JLabel img;
	JButton btn; 
	String name;
	//data d=new data();
	Image_Demo(String nm)
	{
		name=nm;
	}
	
	Image_Demo()
	{
		data d=new data();
		//d.setName(str1);
		System.out.println(d.getName());
		System.out.println(name);
		//super("Sample Image");
		setSize(600,600);
        setLayout(null);
        //----------------------
        
      //-------------------------
     
           img=new JLabel(new ImageIcon("res\\car.jpeg"));
           img.setBounds(10,10,560,540);
           //img.setBorder(BorderFactory.createBevelBorder(1));
           add(img);   
           btn=new JButton(name);
           btn.setBounds(110,110,160,140);
           img.add(btn);
           //----------------------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
  public static void main(String args[])throws Exception
  {
      new Image_Demo();
  }
}