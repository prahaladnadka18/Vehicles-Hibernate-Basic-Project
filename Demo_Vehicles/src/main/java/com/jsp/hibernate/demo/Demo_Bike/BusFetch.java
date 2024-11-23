package com.jsp.hibernate.demo.Demo_Bike;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BusFetch {
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		
		Configuration config = new Configuration();
    	config.configure();
    	config.addAnnotatedClass(Bus.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tran = session.beginTransaction();
    	
    	Bus bb = session.get(Bus.class, 100);
    	System.out.println(bb.getBusId());
    	System.out.println(bb.getBusModel());
    	System.out.println(bb.getBusBrand());
    	System.out.println(bb.getBusPrice());
    	
    	tran.commit();
    	sf.close();
		
	}

}
