package com.cs544.fire.timesheet.dao.impl;

import com.cs544.fire.timesheet.dao.GenericDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by eyob on 2/6/17.
 */
public abstract class GenericDAOImpl <T> implements GenericDAO<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> type;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    public T add(T t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    public T update(T t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    public boolean delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete((T) session.load(type, id));
        return true;
    }

    public T get(long id) {
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }
}
