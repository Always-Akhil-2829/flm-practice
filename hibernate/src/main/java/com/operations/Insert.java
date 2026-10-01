package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Insert {
    public static void main (String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        // when we perform any DML operations we need to begin the transaction
        session.beginTransaction();
        Student student= new Student(1,"Akhil",78);
        //persist method is used to save an object in hibernate
        session.persist(student);
        //after completion of transaction we need to commit the transaction
        session.getTransaction().commit();
        //after commiting we can close session but once closed we cant any operations
        session.close();
    }
}
