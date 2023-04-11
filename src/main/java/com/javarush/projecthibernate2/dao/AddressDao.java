package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Address;
import org.hibernate.SessionFactory;

public class AddressDao extends GenericDao<Address> {
    public AddressDao(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
