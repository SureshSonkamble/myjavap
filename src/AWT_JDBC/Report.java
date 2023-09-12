package AWT_JDBC;
import java.awt.*;
import java.applet.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.font.*;
import java.lang.String.*;
import java.util.*;
import java.text.*;
import java.sql.*;		
import java.awt.Graphics.*;
import javax.imageio.*;
import java.net.*;

class Report extends JFrame implements ActionListener
{
	JButton b11,b22;
	JTable table;
	//Table headings
	String[] colmn={"ID","Name","Mobile"};
	//Rows and Column
	//String[][] data=new String[20][5];
	String[][] data;

	JScrollPane scrollpane ;
	PreparedStatement pstat;
	Connection con;
	Font f=new Font("Bookman Old Style",Font.BOLD, 15);
     Report()
	{
		super("Sample Report");
		b11=new JButton("BACK");
		b22=new JButton("EXIT");
		
		b11.setForeground(Color.blue);
		b22.setForeground(Color.blue);
			
				
		this.setSize(1200,700);
		
		this.setLayout(null);	
		             
					  b22.setBounds(595,620,80,25);
					  b11.setBounds(495,620,80,25);
					  
					  display();
		
		this.setVisible(true);
    }	
    
    public void actionPerformed(ActionEvent ae)
    {
    	int row=table.getSelectedRow();
    	String value=table.getValueAt(row,0).toString();
    	int id=Integer.parseInt(value);

                	
    	JButton b=(JButton)ae.getSource();
    	
		if(b==b11)
		{
			
		// new AdminWork();
		 setVisible(false);
		}
		
		
		if(b==b22)
		{ 
		
		  //   new Exit();
		    setVisible(false);
	    }
    
    }
    
    public void display()
    {
    	try
		{	Class.forName("com.mysql.jdbc.Driver");  // For Mysql connection
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//For MSAccess Connection
		    //Connection cn=DriverManager.getConnection("jdbc:odbc:ss");
		 con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/jdbc_swing","root","");
			Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			 String sql="SELECT COUNT(*) FROM Student";
		        ResultSet rs1=s.executeQuery(sql);
		        rs1.next();
		        int row=rs1.getInt(1);
		        data=new String[row][5];
			
			ResultSet rs;						
	
			String st="select * from student";
		    rs=s.executeQuery(st);
			int i=0;
			while(rs.next())
				{
					String d1=rs.getString(1);
					String d2=rs.getString(2);
				    String d3=rs.getString(3);
				  
									
							data[i][0]=d1;
							data[i][1]=d2;
							data[i][2]=d3;
							
							i++;
					}
				}
					catch(Exception ee)
					{
					}

	  
                                                                                                                           table=new JTable(data,colmn);
				//table.setEnabled(false);
				//table.setFont(f);
				//table.setForeground(Color.magenta);
				int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
				int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
				scrollpane = new JScrollPane(table,v,h);
                                                                                                               	scrollpane.setBounds(10,10,1100,600);
			     	this.add(scrollpane);
					  
						   this.add(b11);
						   b11.setMnemonic('b');
			        	   b11.setToolTipText("Press 'Alt+b' To Go Home");
			           this.add(b22);
			           b22.setMnemonic('e');
						   b22.setToolTipText("Press 'Alt+e' To Go Home");

		
		b11.addActionListener(this);
		b22.addActionListener(this);
		
								
		this.setLocationRelativeTo(null);
    }
    
    public static void main(String str[])
    {
    	new Report();
    }
}		
