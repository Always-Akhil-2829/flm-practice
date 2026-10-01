package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Get {
public static void main (String[] args){
    SessionFactory sessionFactory = HibUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    //we use find method to get the object from db we pass class, primary key
    Student s = session.find(Student.class,1);
    System.out.println(s);
}
}
