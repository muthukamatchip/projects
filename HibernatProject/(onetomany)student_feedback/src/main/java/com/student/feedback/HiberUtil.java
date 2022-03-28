package com.student.feedback;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil 
{
	private static final SessionFactory sessionFactory;
	static {
		
	   try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		   }
	   catch (Throwable e) 
	       {
			System.out.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		   }
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}