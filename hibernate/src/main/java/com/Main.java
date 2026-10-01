package com;

import com.util.HibUtil;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String args[]){
        SessionFactory sessionFactory= HibUtil.getSessionFactory();
        System.out.println(sessionFactory);
        SessionFactory sessionFactory1 = HibUtil.getSessionFactory();
        System.out.println(sessionFactory1);
    }
}
