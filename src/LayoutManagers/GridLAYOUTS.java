package LayoutManagers;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLAYOUTS 
{
    JButton bt,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    GridLAYOUTS()
    {
           JFrame jf=new JFrame();
        jf.setLayout(new GridLayout(4,0));
        
        bt=new JButton("1");
        jf.add(bt);
        bt1=new JButton("2");
        jf.add(bt1);
        bt2=new JButton("3");
        jf.add(bt2);
        bt3=new JButton("4");
        jf.add(bt3);
        bt4=new JButton("5");
        jf.add(bt4);
        bt5=new JButton("6");
        jf.add(bt5);
        bt6=new JButton("7");
        jf.add(bt6);
        bt7=new JButton("8");
        jf.add(bt7);
        bt8=new JButton("9");
        jf.add(bt8);
        bt9=new JButton("10");
        jf.add(bt9);
        jf.setSize(100, 200);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
      
        new GridLAYOUTS();
    }
}