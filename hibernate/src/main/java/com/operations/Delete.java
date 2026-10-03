package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Delete {
    public static void main(String args[]){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //while using remove we need to create an object with correct id then we can perform remove
        Student s= new Student(1,"",0);
        session.beginTransaction();
        //used stored object to remove it from the db
        session.remove(s);
        //committed once the transaction is completed
        session.getTransaction().commit();
        session.close();

    }
}
