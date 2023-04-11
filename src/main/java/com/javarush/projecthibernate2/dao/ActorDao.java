package com.javarush.projecthibernate2.dao;

import com.javarush.projecthibernate2.domain.Actor;
import org.hibernate.SessionFactory;

public class ActorDao extends GenericDao<Actor> {
    public ActorDao(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
