package com.ass.hibernate.Repository;


import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ass.hibernate.entity.UserEntity;
import com.ass.hibernate.util.ConnectionUtil;
import com.ass.hibernate.util.SessionFactoryUtil;

public class Repository {
	
	private static final Serializable id = null;


	public static void saveOrUpdate(UserEntity userEntity)
	{
//		Configuration cfg = new Configuration();
//		cfg.setProperties(ConnectionUtil.getConnection());
//        cfg.addAnnotatedClass(UserEntity.class);
 //      SessionFactory sessionFactory = cfg.buildSessionFactory();
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(userEntity);
        
        transaction.commit();
	}
	
	public static  UserEntity findById(long id) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
       return  session.get(UserEntity.class,id);
	}
	
	
	public void update(UserEntity userEntity)
	{
		UserEntity findById = findById(userEntity.getAlt_key());
		
		if(findById!=null)
		{
			findById.setName("radha");
			findById.setEmail("sita@gmail.com");
			findById.setPassword("sita@123");
			findById.setCountry("india");
			
			saveOrUpdate(findById);
			
		}
		
		
	}
   
}
