package com.pkg1.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.metamodel.source.hbm.HibernateMappingProcessor;

public class TestDao {

	public static void main(String[] args) {
		Study study=new Study();
		study.setSubject("DC");
		study.setCredit("4");
		saveStudy(study);
		
		Study s=getStudyById(1);
		System.out.println(s);
		//deleteStudy(s);
		s.setSubject("Microprocessor");
		updateStudy(s);
		
	}
	public static void saveStudy(Study study)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(study);
		transaction.commit();
		session.close();
	}
	public static Study getStudyById(int id)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Study study=(Study) session.get(Study.class,id);
		transaction.commit();
		session.close();
		return study;
	}
	public static void deleteStudy(Study study)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(study);
		transaction.commit();
		session.close();
	}
	public static void updateStudy(Study study)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(study);
		transaction.commit();
		session.close();
	}
}
