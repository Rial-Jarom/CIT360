package com.jr.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyHibernate {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        RelativeModel relativeModel = new RelativeModel("Oliver Pinkney Miles", "7 Jun 1878");
        Transaction transaction = session.beginTransaction();
        session.save(relativeModel);
        System.out.println("Relative Object was saved successfully!!");
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}