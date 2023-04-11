package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDao extends GenericDao<FilmText> {
    public FilmTextDao(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
