package Admission_into_university;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ipe_details implements ActionListener
{	
	   JFrame jf4;
	   JButton jb1,jb2;
	   Variables_class a;
	   JTextField jtf1,jtf2;
	   ipe_details(Variables_class a)
	   {
		   this.a=a;
		   jf4 = new JFrame("ipe page");
		   jf4.setSize(700, 700);
		   
		   JLabel jl1 = new JLabel();
		   jl1.setBounds(60, 120, 500, 60);
		   String data = "Name : "+a.name_of_person;
		   jl1.setText(data);
		   jl1.setFont(new Font("Serif",Font.BOLD,25));
		   
		   JLabel jl2 = new JLabel("INTERMEDIATE PUBLIC EXAMINATION");
		   jl2.setFont(new Font("Serif",Font.BOLD,25));
		   jl2.setBounds(60, 60, 600, 60);
		   
		   JLabel jl3 = new JLabel("IPE Exam Details...");
		   jl3.setBounds(60, 240, 500, 60);
		   jl3.setFont(new Font("Serif",Font.BOLD,25));
		   
		   JLabel jl4 = new JLabel("Hall Ticket No : ");
		   jl4.setBounds(60, 300, 220, 40);
		   jl4.setFont(new Font("Serif",Font.BOLD,25));
		   jtf1 = new JTextField();
		   jtf1.setBounds(280, 300, 180, 40);
		   
		   JLabel jl5 = new JLabel("Marks : ");
		   jl5.setBounds(60, 360, 220, 40);
		   jl5.setFont(new Font("Serif",Font.BOLD,25));
		   jtf2 = new JTextField();
		   jtf2.setBounds(280, 360, 180, 40);
		   
		   jb1 =new JButton("Submit");
		   jb1.setBounds(340, 450,90, 40);
		   
		   jb2 = new JButton("Back");
		   jb2.setBounds(240, 450,90, 40);
		   
		   jf4.setVisible(true);
		   jf4.setLayout(null);
		   jf4.add(jl1);
		   jf4.add(jl2);jf4.add(jl3);
		   jf4.add(jl4);jf4.add(jtf1);
		   jf4.add(jl5);jf4.add(jtf2);
		   jf4.add(jb1);jf4.add(jb2);
		   
		   jb1.addActionListener(this);
		   jb2.addActionListener(this);
	   }

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==jb1)
		{
			jf4.dispose();
			String ipe_hallticket_no = jtf1.getText();
			a.setIpe_hallticket_no(ipe_hallticket_no);
			String ipe_total = jtf2.getText();
		    a.setIpe_total(ipe_total);
			new ipe_branch_fee(a);
		}
		if(ae.getSource()==jb2)
		{
			new score_branch(a);
			jf4.dispose();
		}
}
}
