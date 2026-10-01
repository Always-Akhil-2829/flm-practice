package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Delete {
    public static void main(String args[]){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Student s= session.find(Student.class,1);
        session.beginTransaction();
        session.remove(s);
        session.getTransaction().commit();
        session.close();

    }
}
