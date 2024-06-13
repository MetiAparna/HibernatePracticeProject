package com.ass.hibernate;

import com.ass.hibernate.Repository.Repository;
import com.ass.hibernate.entity.UserEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UserEntity userEntity = new UserEntity();
        userEntity.setName("ramya");
        userEntity.setEmail("ramya@gmail.com");
        userEntity.setPassword("ramya@123");
        userEntity.setCountry("india");
        
        Repository repository = new Repository();
       // repository.saveOrUpdate(userEntity);
        
      //  UserEntity entity = repository.findById(1);
       // System.out.println(entity);
        
        repository.update(userEntity);
    }
}
