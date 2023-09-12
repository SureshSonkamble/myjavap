package LayoutManagers;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calcu implements ActionListener,MouseListener
{
	JPanel p1,p2;
	JTextField jtf;
	JLabel jl;
	JButton bt,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15;
	JFrame jf;
	String op;
	String str1="0",str2="0",res1;
	int num1,num2,res=0;

	Calcu()
	{
		jf=new JFrame("CALCULATOR");
		jf.setLayout(new GridLayout(2,1));

		jl=new JLabel("CALCULATOR");
		
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(2,1));
		p1.addMouseListener(this);
		jf.add(p1);

		jtf=new JTextField("    ");
		//jtf.setBounds(0,55,200,25);
		
		p1.add(jl);
		p1.add(jtf);

		p2=new JPanel();
		jf.add(p2);
		p2.setLayout(new GridLayout(4,4));

		bt1=new JButton("1");
		p2.add(bt1);
		bt1.addActionListener(this);
		bt1.addMouseListener(this);

		bt2=new JButton("2");
		p2.add(bt2);
		bt2.addActionListener(this);
		bt2.addMouseListener(this);

		bt3=new JButton("3");
		p2.add(bt3);
		bt3.addActionListener(this);
		bt3.addMouseListener(this);

		bt4=new JButton("4");
		p2.add(bt4);
		bt4.addActionListener(this);
		bt4.addMouseListener(this);

		bt5=new JButton("5");
		p2.add(bt5);
		bt5.addActionListener(this);
		bt5.addMouseListener(this);

		bt6=new JButton("6");
		p2.add(bt6);
		bt6.addActionListener(this);
		bt6.addMouseListener(this);

		bt7=new JButton("7");
		p2.add(bt7);
		bt7.addActionListener(this);
		bt7.addMouseListener(this);

		bt8=new JButton("8");
		p2.add(bt8);
		bt8.addActionListener(this);
		bt8.addMouseListener(this);

		bt9=new JButton("9");
		p2.add(bt9);
		bt9.addActionListener(this);
		bt9.addMouseListener(this);

		bt10=new JButton("0");
		p2.add(bt10);
		bt10.addActionListener(this);
		bt10.addMouseListener(this);

		bt11=new JButton("+");
		p2.add(bt11);
		bt11.addActionListener(this);
		bt11.addMouseListener(this);

		bt12=new JButton("-");
		p2.add(bt12);
		bt12.addActionListener(this);
		bt12.addMouseListener(this);

		bt13=new JButton("*");
		p2.add(bt13);
		bt13.addActionListener(this);
		bt13.addMouseListener(this);

		bt14=new JButton("/");
		p2.add(bt14);
		bt14.addActionListener(this);
		bt14.addMouseListener(this);

		bt15=new JButton("=");
		p2.add(bt15);
		bt15.addActionListener(this);
		bt15.addMouseListener(this);		

		bt=new JButton("c");
		p2.add(bt);
		bt.addActionListener(this);
		bt.setBackground(Color.RED);


		jf.setSize(200,300);
		jf.setVisible(true);
		

	}

	public void COLOR()
	{
		
//		int Red=(int)(255*Math.random());
//		int Green=(int)(255*Math.random());
//		int Blue=(int)(255*Math.random());
//
//		Color cl=new Color(Red,Green,Blue);
//		backColor(cl);
	}

    public void mouseClicked(MouseEvent e) {
        COLOR();
    }


    public void mousePressed(MouseEvent e) {
        COLOR();
    }


    public void mouseReleased(MouseEvent e) {
        COLOR();
    }


    public void mouseEntered(MouseEvent e) {
        COLOR();
    }


    public void mouseExited(MouseEvent e) {
        COLOR();
    }

    private void backColor(Color Col) {

	
        
        bt1.setBackground(Col);
        bt2.setBackground(Col);
        bt3.setBackground(Col);
        bt4.setBackground(Col);
        bt5.setBackground(Col);
        bt6.setBackground(Col);
        bt7.setBackground(Col);
        bt8.setBackground(Col);
        bt9.setBackground(Col);
        bt10.setBackground(Col);
        bt11.setBackground(Col);
        bt12.setBackground(Col);
        bt13.setBackground(Col);
        bt14.setBackground(Col);
        bt15.setBackground(Col);


	p1.setBackground(Col);
    }

	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==bt1)
		{
			str1=str1+bt1.getText();	
			jtf.setText(str1);
		}
		else
		{
			if(ae.getSource()==bt2)
			{
			str1=str1+bt2.getText();	
			jtf.setText(str1);
			}
			else
			{
				if(ae.getSource()==bt3)
				{
				str1=str1+bt3.getText();	
				jtf.setText(str1);
				}
				else
				{
					if(ae.getSource()==bt4)
					{
					str1=str1+bt4.getText();	
					jtf.setText(str1);
					}
					else
					{
						if(ae.getSource()==bt5)
						{
						str1=str1+bt5.getText();	
						jtf.setText(str1);
						}
						else
						{
							if(ae.getSource()==bt6)
							{
							str1=str1+bt6.getText();	
							jtf.setText(str1);
							}
							else
							{
								if(ae.getSource()==bt7)
								{
								str1=str1+bt7.getText();	
								jtf.setText(str1);
								}
								else
								{
									if(ae.getSource()==bt7)
									{
									str1=str1+bt7.getText();	
									jtf.setText(str1);
									}
									else
									{	if(ae.getSource()==bt8)
										{
										str1=str1+bt8.getText();	
										jtf.setText(str1);
										}
										else
										{
											if(ae.getSource()==bt9)
											{
											str1=str1+bt9.getText();	
											jtf.setText(str1);
											}
											else
											{
												if(ae.getSource()==bt10)
												{
												str1=str1+bt10.getText();	
												jtf.setText(str1);
												}
												if(ae.getSource()==bt)
												{
													jtf.setText("0");
													str1="0";
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	if(ae.getSource()==bt11)
	{
		str2=str1;
		str1="0";
		jtf.setText(" ");
		op=bt11.getText();
											
	
	}
	else
	{
		if(ae.getSource()==bt12)
		{
			str2=str1;
			jtf.setText(" ");
			str1="0";
			op=bt12.getText();
		}
		else
		{
			if(ae.getSource()==bt13)
			{
				str2=str1;
				jtf.setText(" ");
				str1="0";
				op=bt13.getText();
			}
			else
			{
				if(ae.getSource()==bt14)
				{
					str2=str1;
					jtf.setText(" ");
					str1="0";
					op=bt14.getText();
				}
				
			}
		}
	}
	if(ae.getSource()==bt15)
	{
		str2.trim();
		str1.trim();
		//System.out.println("NO........."+str1+"  "+str2);
		num1= Integer.parseInt(str2);
		num2=Integer.parseInt(str1);
		
		
		if(op=="+")
		{
			res=num1+num2;
			System.out.println("yuppppp::::"+res);
		}
		else if(op=="-")
		{
				 res=num1-num2;
			}else if(op=="*")
			{
				res=num1*num2;
			}
				else if(op=="/")
				{
					res=num1/num2;
				}
				
			
		
	res1=" "+res;
	jtf.setText(res1);
	str1="0";
	str2="0";
		
	}

	}
	public static void main(String[] var)
	{
		new Calcu();
	}
}