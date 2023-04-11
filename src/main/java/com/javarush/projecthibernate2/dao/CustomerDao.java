package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Customer;
import org.hibernate.SessionFactory;

public class CustomerDao extends GenericDao<Customer> {
    public CustomerDao(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}