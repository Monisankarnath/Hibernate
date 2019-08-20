package com.pkg1.O2O;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestO2ODAO {

	public static void main(String[] args) {
		Boy b1=new Boy();
		b1.setName("mani");
		Boy b2=new Boy();
		b2.setName("senshi");
		
		Laptop l1=new Laptop();
		l1.setC_name("ACER");
		Laptop l2=new Laptop();
		l2.setC_name("HP");
		
		l1.setBoy(b1);
		l2.setBoy(b2);
	
		saveLaptop(l1);
		saveLaptop(l2);
	}
	public static void saveLaptop(Laptop laptop)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(laptop);
		
		transaction.commit();
		session.close();
	}
}
