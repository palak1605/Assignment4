package com.login;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.gettersetter;

public class SearchCheck {

	public List<gettersetter> validate(String colour, String size, String gender) {
		Configuration config = new Configuration().configure().addAnnotatedClass(gettersetter.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Query que = session.createQuery("from gettersetter where colour=:colour and size=:size and gender_recommendation=:gr ORDER BY price");
		que.setParameter("colour", colour);
		que.setParameter("gr", gender);
		que.setParameter("size", size);
//		Query que = session.createQuery("from gettersetter");
		@SuppressWarnings("unchecked")
		List<gettersetter> results = que.getResultList();
		return results;
	/*	if (results.isEmpty()) {
			System.out.println("oops plzzzzz enter your data again");
		} else {
			for (gettersetter g : results) {
				System.out.println(g);
			}
			return true;*/
		//}
//	} else {
//		String hql = "from gettersetter where colour=:colour and size=:size and gender_recommendation=:gr ORDER BY rating DESC";
//		Query que = ses.createQuery(hql);
//		que.setString("colour", colour);
//		que.setString("gr", gender_recommendation);
//		que.setString("size", size);
//		List<gettersetter> results = que.list();
//		if (results.isEmpty()) {
//
//			System.out.println("oops plzzzzz enter your data again");
//		} else {
//
//			for (gettersetter g : results) {
//				System.out.println(g);
//			}
//		}

	
	
		
	}

}
