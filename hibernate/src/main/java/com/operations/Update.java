package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Update {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //for update first we need to get the student obj from db then assign it and we make changes
        Student std= session.find(Student.class,1);
        session.beginTransaction();
        std.setMarks(85);
        //merge method is used to update the object
        session.merge(std);
        session.getTransaction().commit();
        session.close();
    }
}
