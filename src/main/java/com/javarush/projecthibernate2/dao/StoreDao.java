package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Store;
import org.hibernate.SessionFactory;

public class StoreDao extends GenericDao<Store> {
    public StoreDao(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
