package Admission_into_university;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class initial_frame  implements ActionListener{
    
	JLabel jl1;
	JFrame jf1;
	JButton admission,exit;
	initial_frame()
	{
	  jf1 = new JFrame("Initial Page");
	  jf1.setSize(700, 700);
	  
	  jl1 = new JLabel("Welcome To Rohith Kakarla University");
	  jl1.setFont(new Font("Serif",Font.BOLD,25));
	  jl1.setBounds(120, 150, 700, 100);
	  
	  admission = new JButton("Admission..");
	  admission.setBounds(100, 350, 200, 50);
	  exit = new JButton("Exit..");
	  exit.setBounds(400, 350, 200, 50);
	  
	  jf1.setLayout(null);
	  jf1.setVisible(true);
	  jf1.add(jl1);
	  jf1.add(admission);
	  jf1.add(exit);
	  
	  admission.addActionListener(this);
	  exit.addActionListener(this);
	}
	public static void main(String[] args) 
	{
	  new initial_frame();
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
	  	if(ae.getSource()==admission)
	  	{
	  	  jf1.dispose();
    	  new personal_page();
	  	}
	  	if(ae.getSource()==exit)
	  	{
	  		jf1.dispose();
	  	}	
	}
}
