package LayoutManagers;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLAYOUTS {

    JButton bt,bt1,bt2,bt3,bt4;
    BorderLAYOUTS()
    {
        JFrame jf=new JFrame();
        jf.setLayout(new BorderLayout());
        
        bt=new JButton("1");
        jf.add(bt,BorderLayout.EAST);
        bt1=new JButton("2");
        jf.add(bt1,BorderLayout.WEST);
        bt2=new JButton("3");
        jf.add(bt2,BorderLayout.NORTH);
        bt3=new JButton("4");
        jf.add(bt3,BorderLayout.SOUTH);
        bt4=new JButton("5");
        jf.add(bt4,BorderLayout.CENTER);
        jf.setSize(100, 200);
        jf.setVisible(true);
    }
    
    public static void main(String[] args)
    {
     
        new BorderLAYOUTS();
    }
}