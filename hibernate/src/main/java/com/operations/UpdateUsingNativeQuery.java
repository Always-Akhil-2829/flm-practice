package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

public class UpdateUsingNativeQuery {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session =  sessionFactory.openSession();
        NativeQuery nativeQuery =session.createNativeQuery("update students set marks = 76 where id =1");
        session.beginTransaction();
        nativeQuery.executeUpdate();
        session.getTransaction().commit();
        Student s = session.find(Student.class,1);
        System.out.println(s);

    }
}
