package com.operations;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.util.HibUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDate;

public class MappingsOperation {
    public static void main(String[] args){
        SessionFactory sessionFactory = HibUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Aadhar aadhar= new Aadhar(1, LocalDate.now());
        Citizen citizen = new Citizen("Akhil",aadhar,24);
        session.beginTransaction();
        session.persist(citizen);
        session.getTransaction().commit();
        Citizen citizen1=session.find(Citizen.class,1);
        System.out.println(citizen1);
    }
}
