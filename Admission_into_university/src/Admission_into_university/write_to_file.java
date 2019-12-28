package Admission_into_university;


import java.io.FileWriter;
import java.io.PrintWriter;

public class write_to_file {

	   
	  write_to_file(Variables_class a) throws Exception
	  {
		FileWriter fw = new FileWriter("admission.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		String name = "Name : "+a.getName_of_person();
		String age = "Age : "+a.getAge();
		String gender = "Gender : "+a.getGender();
        String Fname = "Father Name : "+a.getFname();
        String Fphno = "Father Contact : "+a.getFphno();
        String Focc = "Father Occupation : "+a.getFoccupation();
        String Mname = "Mother Name : "+a.getMname();
        String Mphno = "Mother Contact : "+a.getMphno();
        String Mocc = "Mother Occupation : "+a.getMoccupation();
        String way_exam = a.getWay_exam();
        String branch_to = "Branch : "+a.getBranch();
        
        
        pw.println(name);
        pw.println(age);
        pw.println(gender);
        pw.println(Fname);
        pw.println(Fphno);
        pw.println(Focc);
        pw.println(Mname);
        pw.println(Mphno);
        pw.println(Mocc);
        pw.println("Admission Through : "+way_exam);
        
        
        
        if(way_exam.equals("Eamcet"))
        {
        	a.mains_application_no = "Eamcet Hall Ticket No : "+a.getEamcet_hallticket_no();
        	a.mains_rank = "Eamcet Rank : "+a.getEamcet_rank();
        	pw.println(a.mains_application_no);
        	pw.println(a.mains_rank);
        }
        else if(way_exam.equals("JEE Mains"))
        {
        	a.mains_application_no = a.getMains_application_no();
            a.mains_rank = a.getMains_rank();
        	pw.println("Mains Application No : "+a.mains_application_no);
        	pw.println("Mains Rank : "+a.mains_rank);
        }
        else if(way_exam.equals("Intermediate Public Exam"))
        {
        	a.ipe_hallticket_no = "IPE Hall Ticket No : "+a.getIpe_hallticket_no();
        	a.ipe_total = "IPE Total : "+a.getIpe_total();
        	pw.println(a.ipe_hallticket_no);
        	pw.println(a.ipe_total);
        }
        else if(way_exam.equals("JEE Advanced"))
        {
        	a.advanced_application_no = a.getAdvanced_application_no();
            a.advanced_rank = a.getAdvanced_rank();
        	pw.println("Advanced Application No : "+a.advanced_application_no);
        	pw.println("Advanced Rank : "+a.advanced_rank);
        }
        pw.println(branch_to);
        pw.println("Year Fee Tution : "+a.getYear_fee());
        pw.println("Hostel Fee : "+a.getHostel_fee_total());
        pw.println("Total Fee per Year : "+a.getTotal_fee());
        pw.println("Payment Mode : "+a.pay_mode);
        pw.println();
        pw.println();
        pw.println();
        pw.flush();
	  }
}
