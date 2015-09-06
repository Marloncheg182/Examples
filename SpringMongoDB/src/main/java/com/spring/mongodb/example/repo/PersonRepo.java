package com.spring.mongodb.example.repo;

import com.spring.mongodb.example.entity.Person;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public interface PersonRepo extends CrudRepository<Person, Long>{

    @Query("{'name' : ?0}")
    public Iterable<Person> searchByName(String personName);
}
