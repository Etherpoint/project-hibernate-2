package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDao extends GenericDao<Staff> {
    public StaffDao(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
