package LayoutManagers;


import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableLayout {
	JFrame jf=new JFrame();

	JPanel p1,p2;
	TableLayout()
	{
		p1=new JPanel();
		p1.setLayout(new GridLayout(2,1));
	    jf.add(p1);
		String col[]={"ID","NAME","AGE"};
		String row[][]={{"1","shruti","18"},
				{"2","Suresh","26"},
	};
		JTable jt=new JTable(row,col);
		JScrollPane sp=new JScrollPane(jt);
		p1.add(sp);
		
		jf.setSize(400, 400);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
new TableLayout();
	}

}
