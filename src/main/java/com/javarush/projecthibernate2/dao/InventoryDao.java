package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Inventory;
import org.hibernate.SessionFactory;

public class InventoryDao extends GenericDao<Inventory> {
    public InventoryDao(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
