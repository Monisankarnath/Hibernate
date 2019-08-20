package com.pkg1;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class HobbiesDAO {

	public static void main(String[] args) {
		
		Hobby h1=new Hobby();
		h1.setHobbies("kdrama");
		Hobby h2=new Hobby();
		h2.setHobbies("games");
		
		Human human=new Human();
		human.setName("senshi");
		
		
		h1.setHuman(human);
		h2.setHuman(human);
		saveHobby(h1);
		saveHobby(h2);
		saveHuman(human);
		
		//Human hum=getHumanById(1);
		//deleteHuman(hum);
		
		
		
	}
	public static void saveHobby(Hobby hobby)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(hobby);
		transaction.commit();
		session.close();
	}
	public static void saveHuman(Human human)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(human);
		transaction.commit();
		session.close();
	}
	public static Human getHumanById(int id)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		Human human=(Human) session.get(Human.class,id);
		transaction.commit();
		session.close();
		return human;
	}
	public static void deleteHuman(Human human)
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		session.delete(human);
		transaction.commit();
		session.close();
	}
}
