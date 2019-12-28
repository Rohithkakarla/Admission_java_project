package Admission_into_university;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class personal_page extends Variables_class implements ActionListener,ItemListener
{
	Variables_class a  = new Variables_class();

	JFrame jf2;
	JLabel lname,lage,lf_name,lm_name,lf_phno,lf_occ,lm_phno,lm_occ,jl1,gender;
	JTextField tname,tage,tf_name,tf_phno,tf_occ,tm_name,tm_phno,tm_occ;
	Checkbox gender_male,gender_female;
   personal_page()
   {
	 jf2 = new JFrame("second page");
	 jf2.setSize(900,700);
		
		  lname = new JLabel("Name ");
		  lname.setFont(new Font("Serif",Font.BOLD,18));
		  tname = new JTextField(); 
		  lname.setBounds(80,70,100,40); 
		  tname.setBounds(340,70, 430,40);
		  
		  lage = new JLabel("Age   "); 
		  lage.setFont(new Font("Serif",Font.BOLD,18));
		  tage = new JTextField(); 
		  lage.setBounds(80,120,100,40); 
		  tage.setBounds(340,120, 50,40);
		  
		  CheckboxGroup cbg = new CheckboxGroup(); 
		  gender = new JLabel("Gender "); 
		  gender.setFont(new Font("Serif",Font.BOLD,18));
		  gender.setBounds(80,170,140,40); 
		  gender_male = new Checkbox("Male", cbg,false); 
		  gender_male.setBounds(340, 170,100, 50); 
		  gender_female = new Checkbox("Female", cbg, false); 
		  gender_female.setBounds(450, 170,100, 50);
		  
		/*
		 * gender_male.addItemListener(this); gender_female.addItemListener(this);
		 */
		  lf_name = new JLabel("Father Name  "); tf_name = new JTextField();
		  lf_name.setBounds(80, 220, 200, 40); lf_name.setFont(new
		  Font("Serif",Font.BOLD,18)); tf_name.setBounds(340, 220, 430,40);
		  
		  lf_phno = new JLabel("Father Ph no  "); tf_phno = new JTextField();
		  lf_phno.setBounds(80, 270, 200, 40); lf_phno.setFont(new
		  Font("Serif",Font.BOLD,18)); tf_phno.setBounds(340, 270, 430,40);
		  
		  lf_occ = new JLabel("Father Occuation  "); tf_occ = new JTextField();
		  lf_occ.setBounds(80, 320, 180, 40); lf_occ.setFont(new
		  Font("Serif",Font.BOLD,18)); tf_occ.setBounds(340, 320, 430,40);
		  
		  lm_name = new JLabel("Mother Name "); tm_name = new JTextField();
		  lm_name.setBounds(80, 370, 200, 40); lm_name.setFont(new
		  Font("Serif",Font.BOLD,18)); tm_name.setBounds(340, 370, 430,40);
		  
		  lm_phno = new JLabel("Mother Ph no  "); tm_phno = new JTextField();
		  lm_phno.setBounds(80, 420, 200, 40); lm_phno.setFont(new
		  Font("Serif",Font.BOLD,18)); tm_phno.setBounds(340, 420, 430,40);
		  
		  lm_occ = new JLabel("Mother Occupation"); tm_occ = new JTextField();
		  lm_occ.setBounds(80, 470, 260, 40); lm_occ.setFont(new
		  Font("Serif",Font.BOLD,18)); tm_occ.setBounds(340, 470, 430,40);
		  
		  submit =new JButton("Submit"); submit.setBounds(650, 520,90,40);
		  
		  jf2.add(lname);jf2.add(tname);
		  jf2.add(lage);jf2.add(tage);
		  jf2.add(gender);jf2.add(gender_male);jf2.add(gender_female);
		  jf2.add(lf_name);jf2.add(tf_name); jf2.add(lf_phno);jf2.add(tf_phno);
		  jf2.add(lf_occ);jf2.add(tf_occ); jf2.add(lm_name);jf2.add(tm_name);
		  jf2.add(lm_phno);jf2.add(tm_phno); jf2.add(lm_occ);jf2.add(tm_occ);
		  jf2.add(submit);
		 	 
	 jf2.setLayout(null); jf2.setVisible(true);
	    
	      gender_male.addItemListener(this);
		  gender_female.addItemListener(this);
	 submit.addActionListener(this);
   }

@Override
public void actionPerformed(ActionEvent ae) 
{
  	if(ae.getSource()==submit)
  	{
  		jf2.dispose();
  		//super.name_of_person = tname.getText();
  	    //Variables_class a = new Variables_class();
  	   // a = new Variables_class();

  	   // this.a =a;
  	    a.setName_of_person(tname.getText());
  	    a.setAge(tage.getText());
  	    a.setFname(tf_name.getText());
  	    a.setFphno(tf_phno.getText());
  	    a.setFoccupation(tf_occ.getText());
  	    a.setMname(tm_name.getText());
  	    a.setMphno(tm_phno.getText());
  	    a.setMoccupation(tm_occ.getText());
  		new score_branch(a);
  	}	 
}

@Override
public void itemStateChanged(ItemEvent ie) 
{
   if(ie.getSource()==gender_male)
   {
	   a.setGender("Male");
   }
   if(ie.getSource()==gender_female)
   {	
	   a.setGender("Female");
   }
	
}
}
