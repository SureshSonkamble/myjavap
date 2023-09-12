package AWT_JDBC;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.color.*;
import java.awt.event.*;
import java.text.*;

class Student extends JFrame implements ActionListener
{ 
      Connection con;
      Statement stmt;
      ResultSet rst;
      PreparedStatement pstmt; 
      JLabel NameL,MobileL,headL;
      JButton saveB,clearB,exitB,openB;
      JTextField NameT,MobileT;
     
       JPanel P1;
       JPanel P2; 
       JPanel P3;
       Font f1,f2;
        JScrollPane spane;
    Student()      //Constructor
     { 
        setSize(800,500);
        setLayout(null);
        setTitle("Student Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	    	int x = (d.width - getSize().width) / 2;
    		int y = (d.height - getSize().height) / 2;
	    	setLocation(x, y);
	    	
	    	JPanel P1=new JPanel();                  //P1 for Header
    	    P1.setBounds(0,0,getSize().width,50);
            P1.setBackground(new Color(140,140,140));
            P1.setLayout(null);
            
       Font f1=new Font("Lucida Calligraphy",Font.BOLD & Font.ITALIC,26);  //Header name
	   headL=new JLabel("JDBC WITH SWING",JLabel.CENTER);
       headL.setBounds(0,15,getWidth(),25);
   	   headL.setFont(f1);
   	   headL.setForeground(Color.white);
   	   
       P1.add(headL);
       
       JPanel P2=new JPanel();                   //P2 for Data entry
            P2.setBounds(0,50,getSize().width,350);
            P2.setBackground(new Color(206,206,206));
            P2.setLayout(null); 
   
       NameL=new JLabel("Name: ");
       NameL.setBounds(110,100,80,20);
       NameL.setFont(f2);
       P2.add(NameL);
       
        NameT=new JTextField();
        NameT.setBounds(170,100,150,20);
        P2.add(NameT);
       
      
            
        MobileL=new JLabel("Mobile: ");               
        MobileL.setBounds(110,160,80,20);
        MobileL.setFont(f2);
        P2.add(MobileL);
        MobileT=new JTextField();
        MobileT.setBounds(170,160,150,20);
        P2.add( MobileT);
       
            Font f2=new Font("Trebuchet MS",Font.BOLD,14);
            JPanel P3=new JPanel();                      //P3 for Button
            P3.setBounds(0,400,getSize().width,100);
            P3.setBackground(new Color(140,140,140));
            P3.setLayout(null); 
        saveB=new JButton("Save");
        saveB.addActionListener(this);
        saveB.setBounds(80,20,80,30);
        P3.add(saveB);     

        clearB=new JButton("Clear");
        clearB.addActionListener(this);
        clearB.setBounds(190,20,80,30);
        P3.add(clearB);     
       
       
      
       exitB=new JButton("Exit");
       exitB.addActionListener(this);
       exitB.setBounds(300,20,80,30);
       P3.add(exitB);          
       add(P1);
       add(P2);
       add(P3);
       setResizable(false);
        setVisible(true);
     }
     
   public void actionPerformed(ActionEvent e)
    {
          	if(e.getSource()==saveB)
          	 {
          	 	try
          	 	{
          	 	
          	 	int res = 0;
          	 	
		        String	name,mobile;
          	 	
		        name=NameT.getText();
		        mobile=MobileT.getText();
          	 	
       
          	        	 	 
          	 	
          	   //Driver connection
	        	 	 
	          
	       Class.forName("com.mysql.jdbc.Driver");  
	        System.out.println("Connection OK");
	     
	        con=DriverManager.getConnection(  
	        				"jdbc:mysql://localhost:3306/jdbc_swing","root","");
	          	 	System.out.println("Driver OK");
	          	 	
	          	 	
	          	 	
         	String Q="insert into student(name,mobile) values(?,?)";
            pstmt=con.prepareStatement(Q);
            
              pstmt.setString(1,name);
              pstmt.setString(2,mobile); 
               System.out.println(Q);
               
               int r=pstmt.executeUpdate();
              System.out.println(Q);
              
        if(r>0)
            {
             	JOptionPane.showMessageDialog(this,"Record saved Successfully");
            }
         else
             JOptionPane.showMessageDialog(this,"Record not saved Successfully");
          	 }
          catch(Exception e1)
          	 {
          	 	 System.out.println(e1);
          	 }

         } // Close IF
         else 
           if(e.getSource()==clearB)
             {
             	NameT.setText("");
             	MobileT.setText("");
             	             	
             }
              else
              if(e.getSource()==exitB)
                 {
                 	dispose();
                 	System.out.println("Exited from Pay successfully");
                 }
          	 
          } // Close Method
	
 public static void main(String args[])throws Exception
  		{
      			new Student();
  		}
} //Close Class
