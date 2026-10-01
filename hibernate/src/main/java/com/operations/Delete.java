package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Delete {
    public static void main(String args[]){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //first i took obj from the db and stored
        Student s= session.find(Student.class,1);
        session.beginTransaction();
        //used stored object to remove it from the db
        session.remove(s);
        //committed once the transaction is completed
        session.getTransaction().commit();
        session.close();

    }
}
