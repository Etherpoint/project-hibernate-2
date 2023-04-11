package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class RentalDao extends GenericDao<Rental> {
    public RentalDao(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRental() {
        Query<Rental> query = getCurrentSession().createQuery("select r from Rental r where r.returnDate is null ", Rental.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
