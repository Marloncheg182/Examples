package com.examples.test;

import com.examples.bean.Person;
import com.examples.repo.PersonRepo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;

/**
 * Created by Oleg Romanenchuk on 8/28/2015.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new ClassPathResource("resources/spring-config.xml").getPath());
        PersonRepo personRepo = (PersonRepo)ctx.getBean("personRepo");

        Person person = new Person();
        person.setId("1");
        person.setAge(55);
        person.setGender(Person.Gender.FEMALE);
        person.setName("Oracle");

        personRepo.save(person);

        Person person2 = new Person();
        person2.setId("2");
        person2.setAge(60);
        person2.setGender(Person.Gender.MALE);
        person2.setName("TheArchitect");

        personRepo.save(person2);

        Person person3 = new Person();
        person3.setId("3");
        person3.setAge(25);
        person3.setGender(Person.Gender.MALE);
        person3.setName("TheOne");

        personRepo.save(person3);

        System.out.println("Finding the One : "+personRepo.find("3"));
        Map<Object,Object> personMatrixMap = personRepo.findAll();
        System.out.println("Currently in the Redis Matrix");
        System.out.println(personMatrixMap);
        System.out.println("Deleting The Architect ");
        personRepo.delete("2");
        personMatrixMap = personRepo.findAll();
        System.out.println("Remnants .. : ");
        System.out.println(personMatrixMap);

        ctx.close();

    }

}
