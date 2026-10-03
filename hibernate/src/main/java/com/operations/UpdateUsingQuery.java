package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import java.util.List;

public class UpdateUsingQuery {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        MutationQuery mutationQuery = session.createMutationQuery("update Student set marks=:marks where id=:id");
        mutationQuery.setParameter("marks",50);
        mutationQuery.setParameter("id",1);
        session.beginTransaction();
        mutationQuery.executeUpdate();
        session.getTransaction().commit();
        Student s =  session.find(Student.class,1);
        System.out.println(s);

    }
}
