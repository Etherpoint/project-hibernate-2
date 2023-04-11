package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Country;
import org.hibernate.SessionFactory;

public class CountryDao extends GenericDao<Country> {
    public CountryDao(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
