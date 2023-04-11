package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Category;
import org.hibernate.SessionFactory;

public class CategoryDao extends GenericDao<Category> {
    public CategoryDao(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
