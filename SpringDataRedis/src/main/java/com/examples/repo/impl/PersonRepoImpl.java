package com.examples.repo.impl;

import org.springframework.data.redis.core.RedisTemplate;

import com.examples.bean.Person;
import com.examples.repo.PersonRepo;

import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 8/28/2015.
 */
public class PersonRepoImpl implements PersonRepo {

    private RedisTemplate<String, Person> redisTemplate;

    private static String PERSON_KEY = "Person";

    public RedisTemplate<String, Person> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Person> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void save(Person person) {
        this.redisTemplate.opsForHash().put(PERSON_KEY, person.getId(), person);
    }

    public Person find(String id) {
        return (Person) this.redisTemplate.opsForHash().get(PERSON_KEY, id);
    }

    public Map<Object, Object> findAll() {
        return this.redisTemplate.opsForHash().entries(PERSON_KEY);
    }

    public void delete(String id) {
        this.redisTemplate.opsForHash().delete(PERSON_KEY, id);
    }
}
