package com.student.feedback;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Answer 
{
	void fetchFeedback()
{
		SessionFactory sessionFactory=HiberUtil.getSessionFactory();
		Session s =sessionFactory.openSession();
		try {
			   Transaction tr=s.beginTransaction();
		       Student stu =new Student();
		       stu.setStudentName("mani");
		       stu.setFeedback("your class is good");
		       Student stu2 =new Student();
		       stu2.setStudentName("dinesh");
		       stu2.setFeedback("your class is poor");  
		       Student stu3 =new Student(); 
		       stu3.setStudentName("ravi");
		       stu3.setFeedback("your class is average");
		      
		    	ArrayList<Student> student = new ArrayList<>();
		    	student.add(stu);
		    	student.add(stu2);
			    student.add(stu3);
			   
			    Staff f = new Staff();
			    f.setStaff_Name("Muthu");
			    f.setAsk_Feedback("students give me a feedback");
			    f.setStudent(student);
			    s.save(f);
	        	tr.commit();
				s.close();
				System.out.println("save successfully");

		}
			   
			   catch(HibernateException m ) 
		{
				   System.out.println("hibernate is error" +m);
	    }
		 	

}
	public static void main(String args[]) {
		Answer a =new Answer();
		a.fetchFeedback();
	}
}

