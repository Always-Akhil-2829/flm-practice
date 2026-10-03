package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import java.util.List;

public class GetAll {
    public  static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //There is no method is available in hibernate to get all so we use HQL to retrive
        SelectionQuery<Student> selectionQuery = session.createSelectionQuery("select s from Student s", Student.class);
        // we can use below method also if we are performing getting all objects
        SelectionQuery<Student> selectionQuery1 = session.createSelectionQuery("from Student", Student.class);

        List<Student> list = selectionQuery.list();
        List<Student> list1 = selectionQuery.list();

        System.out.println(list);
        System.out.println(list1);
    }
}
