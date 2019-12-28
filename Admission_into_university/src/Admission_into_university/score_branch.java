package Admission_into_university;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class score_branch extends Variables_class implements ActionListener
{
	
	Variables_class a;
	JFrame jf3;
  score_branch(Variables_class a)
  {
	  this.a=a;
	  jf3 = new JFrame("final Page");
	  jf3.setSize(700, 700);
	  
	  //mains,eamcet,ipe,advanced
	  JLabel based_on = new JLabel("Admission Based On..");
	  based_on.setFont(new Font("Serif",Font.BOLD,25));
	  based_on.setBounds(60, 60, 300,70);
	  
	  mains = new JButton("JEE MAINS");
	  mains.setBounds(60, 150, 500, 40);
	  
	  eamcet = new JButton("EAMCET");
	  eamcet.setBounds(60, 240, 500, 40);
	  
	  ipe = new JButton("INTER PUBLIC EXAM");
	  ipe.setBounds(60, 330, 500, 40);
	  
	  advanced = new JButton("ADVANCED");
	  advanced.setBounds(60, 420, 500, 40);
	  
	  jf3.setLayout(null); jf3.setVisible(true);
	  jf3.add(mains);jf3.add(eamcet);jf3.add(ipe);jf3.add(advanced);
	  jf3.add(based_on);
	 
	  
	  mains.addActionListener(this);
	  eamcet.addActionListener(this);
	  ipe.addActionListener(this);
	  advanced.addActionListener(this);
	  
  }

  @Override
  public void actionPerformed(ActionEvent ae) 
   {
  	if(ae.getSource()==mains)
  	 {  
  		a.setWay_exam("JEE Mains");
        new mains_details(a);
        jf3.dispose();
     }
  	if(ae.getSource()==eamcet)
 	 {
  		a.setWay_exam("Eamcet");
       new eamcet_details(a);
       jf3.dispose();
    }
  	if(ae.getSource()==ipe)
 	 {
  		a.setWay_exam("Intermediate Public Exam");
       new ipe_details(a);
       jf3.dispose();
    }
  	if(ae.getSource()==advanced)
 	 {
  		a.setWay_exam("JEE Advanced");
       new advanced_details(a);
       jf3.dispose();
    }
}
}
