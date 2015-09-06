package com.examples.repo;

import com.examples.bean.Person;

import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 8/28/2015.
 */
public interface PersonRepo {
    public void save(Person person);

    public Person find(String id);

    public Map<Object, Object> findAll();

    public void delete(String id);
}
