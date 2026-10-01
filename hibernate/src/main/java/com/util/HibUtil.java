package com.util;

import com.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
    private static SessionFactory sessionFactory =null;
    //This method returns single session factory obj by calling any number of time this type of design is called Singleton design pattern.
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration cfg = new Configuration().configure();
            //we need to give all the entites to the config then only it will works
            cfg.addAnnotatedClass(Student.class);
            SessionFactory sf= cfg.buildSessionFactory();
            return  sessionFactory=sf;
        }
        else return sessionFactory;
    }
}
