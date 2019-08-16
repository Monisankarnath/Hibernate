package com.pkg1.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	static{
		if(sessionFactory==null)
		{
			try{
			sessionFactory=new Configuration().configure().buildSessionFactory();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
		
	
}
