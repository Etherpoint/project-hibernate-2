package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Film;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class FilmDao extends GenericDao<Film> {
    public FilmDao(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }

    public Film getFirstAvailableFilmForRent() {
        Query<Film> query = getCurrentSession().createQuery("select f from Film f " +
                "where f.id not in (select distinct film.id from Inventory)", Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}