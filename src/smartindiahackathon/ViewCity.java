/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartindiahackathon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewCity extends JDialog
{
	JScrollPane jsp;
	JTable table;
	DefaultTableModel model;
	String columns[];
	
	public ViewCity(String a)
	{
		columns=new String []{"Owner ID","Owner Name","Organisation Name","City","Address","Phone Number","Livestock Type","Number of Livestock","Production"};
		model=new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table=new JTable();
		//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(model);
		table.setFillsViewportHeight(true);
		String st="select * from dealer where city=?";
		Connection con=MyConnection.connect();
		try
		{
			PreparedStatement ps=con.prepareStatement(st);
                        ps.setString(1, a);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String id=rs.getString("ID");
				String name=rs.getString("name");
				String on=rs.getString("oname");
				String c=rs.getString("city");
                                String ad=rs.getString("address");
                                String pn=rs.getString("pno");
                                String t=rs.getString("type");
                                String n=rs.getString("nol");
                                String p=rs.getString("prod");
				model.addRow(new Object[]{id, name, on,c,ad,pn,t,n,p});
				
			}
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		getContentPane().setLayout(null);
		setSize(1000,750);
		jsp=new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setBounds(10, 80, 964, 600);
		getContentPane().add(jsp);
                setLocationRelativeTo(null);
		setVisible(true);
	}
}