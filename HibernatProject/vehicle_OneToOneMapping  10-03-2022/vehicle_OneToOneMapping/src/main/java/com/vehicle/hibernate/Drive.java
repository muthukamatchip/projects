package com.vehicle.hibernate;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Drive {

	public static void main(String[] args) {
		  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		Transaction t=session.beginTransaction();
		try {
			User us=new User();
			us.setName("Muthu");
			us.setAddress("Dindigul TamilNadu");
			us.setEmail("muthu23@gamil.com");
			us.setPhone(9235674768l);
			Vehicle vc=new Vehicle();
			vc.setVehicle_name("Duke");
			vc.setVehicle_model(2022);
			vc.setVehicle_power(390);
			us.setVehicle(vc);
			vc.setUser(us);
			session.persist(vc);
			session.persist(us);
			t.commit();
			session.close();
			System.out.println("Data Saved Successfully....!!!");	
		}
        catch(HibernateException h) {
        	System.out.println("Hibernate Error is......"+h);
        }
	}

}
