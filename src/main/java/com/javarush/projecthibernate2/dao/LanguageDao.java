package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Language;
import org.hibernate.SessionFactory;

public class LanguageDao extends GenericDao<Language> {
    public LanguageDao(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
