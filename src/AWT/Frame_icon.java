package AWT;

import java.awt.*;

import javax.swing.ImageIcon;  
class Frame_icon extends Frame{  
	
	Frame_icon(){  
		
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("clown.png")));
setVisible(true);//now frame will be visible, by default not visible  


}  
	
public static void main(String args[]){  
	Frame_icon f=new Frame_icon();  
}} 