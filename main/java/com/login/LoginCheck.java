package com.login;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.gettersetter;

@Component
public class LoginCheck {


	@SuppressWarnings("deprecation")
	public boolean validate(String username, String password) {
//		System.out.println("lc"+username);
		Configuration config = new Configuration().configure().addAnnotatedClass(model.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		try {
			@SuppressWarnings("unchecked")
			model p =(model)session.get(model.class, username);
			if (p != null && p.getPassword().equals(password)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
}