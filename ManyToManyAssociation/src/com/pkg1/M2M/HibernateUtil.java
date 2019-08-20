package com.pkg1.M2M;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static{
		if(sessionFactory == null)
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
