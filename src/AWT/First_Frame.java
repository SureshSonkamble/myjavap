package AWT;
import java.awt.*;
import javax.swing.*;
class First_Frame extends JFrame 
{     
       First_Frame()
	     {
		super("Sample Frame");
		setSize(300,200);
        setLayout(null);
        
        setVisible(true);
    }
  public static void main(String args[])
  {
	
      new First_Frame();
  }
}