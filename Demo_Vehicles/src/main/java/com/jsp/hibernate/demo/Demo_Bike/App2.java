package com.jsp.hibernate.demo.Demo_Bike;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus();
		b1.setBusId(100);
		b1.setBusBrand("Ashok");
		b1.setBusModel("BS4");
		b1.setBusPrice(3000000);
		
		Configuration config = new Configuration();
    	config.configure();
    	config.addAnnotatedClass(Bus.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tran = session.beginTransaction();
    	
    	session.save(b1);
    	
    	tran.commit();
    	sf.close();
		
	}

}
