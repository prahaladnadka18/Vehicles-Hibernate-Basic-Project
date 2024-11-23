package com.jsp.hibernate.demo.Demo_Bike;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Bike b = new Bike();
    	b.setBikeId(101);
    	b.setBikeBrand("Bajaj");
    	b.setBikeModel("Pulsar");
    	b.setBikePrice(150000);
    	
    	Configuration config = new Configuration();
    	config.configure();
    	config.addAnnotatedClass(Bike.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tran = session.beginTransaction();
    	
    	session.save(b);
    	
    	tran.commit();
    	sf.close();
    	
    	
    }
}
