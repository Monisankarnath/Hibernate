package com.pkg1.M2M;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SiblingsDAO {

	public static void main(String[] args) {
		Brothers b1=new Brothers();
		b1.setName("mani");
		Brothers b2=new Brothers();
		b2.setName("suman");
		
		Sisters s1=new Sisters();
		s1.setName("sangeeta");
		Sisters s2=new Sisters();
		s2.setName("sushmita");
		Sisters s3=new Sisters();
		s3.setName("sunayana");
		
		b1.getListofSisters().add(s1);
		b1.getListofSisters().add(s2);
		b1.getListofSisters().add(s3);
		
		b2.getListofSisters().add(s1);
		b2.getListofSisters().add(s2);
		b2.getListofSisters().add(s3);
		
		saveBrothers(b1);
		saveBrothers(b2);
		
	}
	
	public static void saveBrothers(Brothers brothers)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(brothers);
		transaction.commit();
		session.close();
	}
	
}
