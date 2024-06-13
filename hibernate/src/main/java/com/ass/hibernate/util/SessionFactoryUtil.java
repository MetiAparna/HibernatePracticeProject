package com.ass.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ass.hibernate.entity.UserEntity;

public class SessionFactoryUtil {
	
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionUtil.getConnection());
			cfg.addAnnotatedClass(UserEntity.class);
			sessionFactory=cfg.buildSessionFactory();
		}
			return sessionFactory;
			
		
	}

}
