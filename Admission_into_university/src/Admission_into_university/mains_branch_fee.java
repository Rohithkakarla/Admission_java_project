package Admission_into_university;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class mains_branch_fee implements ActionListener,ItemListener
{
  JFrame jf1;
  JLabel jl1,yearly_fee,hostel_fee,total,pay_mode,branch_view;
  JButton cse,eee,ece,mech,civil,jb1,pay,submit;
  Checkbox int_bank,onl_trans,upi_pay;
  int mains_rank;
  Variables_class a;
  
  mains_branch_fee(Variables_class a)
  {
	  this.a =a;
	  jf1 = new JFrame("mains_branch page");
	  jf1.setSize(900, 900);
	  
	  jf1.setVisible(true);
	  jf1.setLayout(null);
	  
	  branch_view = new JLabel();
	  branch_view.setBounds(60,160,600,40);
	  branch_view.setFont(new Font("Serif",Font.BOLD,25));
	  
	  yearly_fee = new JLabel();
	  yearly_fee.setBounds(60, 220, 500, 40);
	  yearly_fee.setFont(new Font("Serif",Font.BOLD,25));
	  
	  hostel_fee = new JLabel();
	  hostel_fee.setBounds(60,280,500,40);
	  hostel_fee.setFont(new Font("Serif",Font.BOLD,25));
	  
	  total = new JLabel();
	  total.setBounds(60,350,500,40);
	  total.setFont(new Font("Serif",Font.BOLD,25));
	  
	  pay_mode = new JLabel();
	  pay_mode.setBounds(100,470,500,40);
	  pay_mode.setFont(new Font("Serif",Font.BOLD,25));
	  
	  CheckboxGroup cbg = new CheckboxGroup();
	  int_bank = new Checkbox("Internet Banking", cbg,false); 
	  int_bank.setBounds(100, 520,150, 50); 
	  onl_trans = new Checkbox("Online Transfer", cbg, false); 
	  onl_trans.setBounds(260, 520,150, 50);
	  upi_pay = new Checkbox("UPI Payment", cbg, false); 
	  upi_pay.setBounds(420, 520,150, 50);
	  
	  submit = new JButton("Submit");
	  submit.setBounds(500, 650,150,50);
	  submit.addActionListener(this);
	  
	  jf1.add(yearly_fee);jf1.add(hostel_fee);jf1.add(total);
	  jf1.add(pay_mode);
	  
	  try 
	  {
	      mains_rank = Integer.parseInt(a.mains_rank);
	    
	      cse = new JButton("CSE");
		  cse.setBounds(50, 60, 90, 40);
		  ece = new JButton("ECE");
		  ece.setBounds(200, 60, 90, 40);
		  eee = new JButton("EEE");
		  eee.setBounds(350, 60, 90, 40);
		  mech = new JButton("MECH");
		  mech.setBounds(500, 60, 90, 40);
		  civil = new JButton("CIVIL");
		  civil.setBounds(650, 60, 90, 40);
		  
		  if(mains_rank>1 && mains_rank<10000)
		  {
			  cse.addActionListener(this);
			  ece.addActionListener(this);
			  eee.addActionListener(this);
			  mech.addActionListener(this);
			  civil.addActionListener(this);
		  }
		  else if(mains_rank>10001 && mains_rank<20000)
		  {
			  cse.setEnabled(false);
			  ece.addActionListener(this);
			  eee.addActionListener(this);
			  mech.addActionListener(this);
			  civil.addActionListener(this);
		  }
		  else if(mains_rank>20001 && mains_rank<30000)
		  {
			  cse.setEnabled(false);
			  ece.setEnabled(false);
			  eee.addActionListener(this);
			  mech.addActionListener(this);
			  civil.addActionListener(this);
		  }
		  else if(mains_rank>30001 && mains_rank<40000)
		  {
			  cse.setEnabled(false);
			  ece.setEnabled(false);
			  eee.setEnabled(false);
			  mech.addActionListener(this);
			  civil.addActionListener(this);
		  }
		  else if(mains_rank>40001 && mains_rank<50000)
		  {
			  cse.setEnabled(false);
			  ece.setEnabled(false);
			  eee.setEnabled(false);
			  mech.setEnabled(false);
			  civil.addActionListener(this);
		  }
		  else
		  {
			  cse.setEnabled(false);
			  ece.setEnabled(false);
			  eee.setEnabled(false);
			  mech.setEnabled(false);
			  civil.setEnabled(false);
			  JLabel jl2 = new JLabel("No Branch Available");
			  jl2.setBounds(250, 450, 400, 60);
			  jl2.setFont(new Font("Serif",Font.BOLD,25));
		
			  jb1 = new JButton("Home Page");
			  jb1.setBounds(335,550,90,40);
			  jb1.addActionListener(this);
			  
			  jf1.add(jl2);
			  jf1.add(jb1);	  
		  }
		  
		  jf1.add(cse);jf1.add(ece);jf1.add(eee);jf1.add(mech);jf1.add(civil);
		  
	  }
	  catch(NumberFormatException nfe)
	  {
		jf1.dispose();
		new mains_details(a);  
	  } 
  }

@Override
public void actionPerformed(ActionEvent ae) 
{
   if(ae.getSource()==jb1)
   {
	   jf1.dispose();
	   new score_branch(a);  
   }
   
   if(ae.getSource()==cse)
   {
	   branch_view.setText("Branch : Computer Science and Engineering ");
	   yearly_fee.setText("Fee Per Year        : 1,05,000 /-");
	   hostel_fee.setText("Hostel Fee Per Year : 95,000 /-");
	   total.setText("Total Fee Per Year : 2,00,000 /-");
       pay_mode.setText("Payment Mode..");
       a.setBranch("Computer Science and Engineering");
	   a.setTotal_fee("2,00,000 /-");
	   a.setYear_fee("1,05,000 /-");
	   a.setHostel_fee_total("95,000 /-");
	   jf1.add(onl_trans);jf1.add(int_bank);jf1.add(upi_pay);
	   onl_trans.addItemListener(this);
	   int_bank.addItemListener(this);
	   upi_pay.addItemListener(this);
	   jf1.add(submit);
	   
   }
   if(ae.getSource()==ece)
   {
	   branch_view.setText("Branch : Electronics and Communication Engineering ");
	   yearly_fee.setText("Fee Per Year        : 1,05,000 /-");
	   hostel_fee.setText("Hostel Fee Per Year : 95,000 /-");
	   total.setText("Total Fee Per Year : 2,00,000 /-");
       pay_mode.setText("Payment Mode..");
       a.setBranch("Electronics and Communication Engineering");
	   a.setTotal_fee("2,00,000 /-");
	   a.setYear_fee("1,05,000 /-");
	   a.setHostel_fee_total("95,000 /-");
	   jf1.add(onl_trans);jf1.add(int_bank);jf1.add(upi_pay);
	   onl_trans.addItemListener(this);
	   int_bank.addItemListener(this);
	   upi_pay.addItemListener(this);
	   jf1.add(submit);
   }
   if(ae.getSource()==eee)
   {
	   branch_view.setText("Branch : Electrical and Electronic Engineering ");
	   yearly_fee.setText("Fee Per Year        : 1,05,000 /-");
	   hostel_fee.setText("Hostel Fee Per Year : 95,000 /-");
	   total.setText("Total Fee Per Year : 2,00,000 /-");
       pay_mode.setText("Payment Mode..");
       a.setBranch("Electrical and Electronics Engineering");
	   a.setTotal_fee("2,00,000 /-");
	   a.setYear_fee("1,05,000 /-");
	   a.setHostel_fee_total("95,000 /-");
	   onl_trans.addItemListener(this);
	   int_bank.addItemListener(this);
	   upi_pay.addItemListener(this);
	   jf1.add(onl_trans);jf1.add(int_bank);jf1.add(upi_pay);
	   jf1.add(submit);
   }
   if(ae.getSource()==mech)
   {
	   branch_view.setText("Branch : Mechanical Engineering ");
	   yearly_fee.setText("Fee Per Year        : 1,05,000 /-");
	   hostel_fee.setText("Hostel Fee Per Year : 95,000 /-");
	   total.setText("Total Fee Per Year : 2,00,000 /-");
       pay_mode.setText("Payment Mode..");
       a.setBranch("Mechanical Engineering");
	   a.setTotal_fee("2,00,000 /-");
	   a.setYear_fee("1,05,000 /-");
	   a.setHostel_fee_total("95,000 /-");
	   onl_trans.addItemListener(this);
	   int_bank.addItemListener(this);
	   upi_pay.addItemListener(this);
	   jf1.add(onl_trans);jf1.add(int_bank);jf1.add(upi_pay);
	   jf1.add(submit);
   }
   if(ae.getSource()==civil)
   {
	   branch_view.setText("Branch : Civil Engineering ");
	   yearly_fee.setText("Fee Per Year        : 1,05,000 /-");
	   hostel_fee.setText("Hostel Fee Per Year : 95,000 /-");
	   total.setText("Total Fee Per Year : 2,00,000 /-");
       pay_mode.setText("Payment Mode..");
       a.setBranch("Civil Engineering");
	   a.setTotal_fee("2,00,000 /-");
	   a.setYear_fee("1,05,000 /-");
	   a.setHostel_fee_total("95,000 /-");
	   onl_trans.addItemListener(this);
	   int_bank.addItemListener(this);
	   upi_pay.addItemListener(this);
	   jf1.add(onl_trans);jf1.add(int_bank);jf1.add(upi_pay);
	   jf1.add(submit);
   }
   if(ae.getSource()==submit)
   {
	   jf1.dispose();
	   JFrame jf2 = new JFrame("thanks mains page");
	   jf2.setSize(700, 700);
	   
	   JLabel jl2 = new JLabel("Thanks For Your Admission");
	   jl2.setBounds(100, 350,400 , 60);
	   jl2.setFont(new Font("Serif",Font.BOLD,25));
	   
	   jf2.add(jl2);
	   jf2.setVisible(true);
	   jf2.setLayout(null);
	   try {
		new write_to_file(a);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   JButton jb3 = new JButton("Exit");
		  jb3.setBounds(400, 550, 70, 40);
		  jf2.add(jb3);
		  jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			  
		  });
   }

}
@Override
public void itemStateChanged(ItemEvent ie) 
{
  if(ie.getSource()==int_bank)
  {
	  a.setPay_mode("Internet Banking");  
  }
  if(ie.getSource()==onl_trans)
  {
	  a.setPay_mode("Online Transaction");
  }
  if(ie.getSource()==upi_pay)
  {
	  a.setPay_mode("UPI Transaction");
  }
	
}
}
