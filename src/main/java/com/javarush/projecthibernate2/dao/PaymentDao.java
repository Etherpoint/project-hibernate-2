package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Payment;
import org.hibernate.SessionFactory;

public class PaymentDao extends GenericDao<Payment> {
    public PaymentDao(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
