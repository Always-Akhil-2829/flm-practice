package com.operations;

import com.entity.Student;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import java.util.List;

public class GettingFromQuery {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        SelectionQuery<Student> selectionQuery = session.createSelectionQuery("from Student where id = 1", Student.class);
        List<Student> list = selectionQuery.list();
        System.out.println(list);
    }
}
