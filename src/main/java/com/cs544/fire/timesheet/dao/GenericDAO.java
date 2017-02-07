package com.cs544.fire.timesheet.dao;

/**
 * Created by eyob on 2/6/17.
 */
public interface GenericDAO<T> {

        T add(T t);

        T update(T t);

        boolean delete(long id);

        T get(long id);


}
