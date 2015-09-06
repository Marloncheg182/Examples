package com.spring.cassandra.example.entity;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Oleg Romanenchuk on 8/29/2015.
 */
public interface PersonRepo extends CrudRepository<Person, String>{

    @Query("Select * from person whee pid=?0")
    public Person fetchByPid(int pid);
}
