package com.spring.mongodb.example.test;

import com.spring.mongodb.example.entity.Address;
import com.spring.mongodb.example.entity.Person;
import com.spring.mongodb.example.repo.AddressRepo;
import com.spring.mongodb.example.repo.PersonRepo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new ClassPathResource("spring-config.xml").getPath());
        PersonRepo personRepo = ctx.getBean(PersonRepo.class);
        AddressRepo addressRepo = ctx.getBean(AddressRepo.class);

        Person personAchilles = new Person();
        personAchilles.setPersonId(1l);
        personAchilles.setName("Achilles");
        personRepo.save(personAchilles);
        Person personHektor =  new Person();
        personHektor.setPersonId(2l);
        personHektor.setName("Hektor");

        Address address = new Address("221b Baker Street",1,"London NW1","London",12345l);
        List<Address> addresses = personHektor.getAddres();
        addresses.add(address);
        personAchilles.setAddres(addresses);

        addressRepo.save(address);
        personRepo.save(personHektor);

        Iterable<Person> persons = personRepo.findAll();
        System.out.println("Person List: ");
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("Person Record with name Hektor  is " + personRepo.searchByName("Hektor"));
        ctx.close();
    }
}
