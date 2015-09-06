package com.spring.batch.partitioning.util;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/28/2015.
 */
public class PersonMapper implements RowMapper {
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {

        Person person = new Person();
        person.setFirstName(resultSet.getString("firstName"));
        person.setLastName(resultSet.getString("lastName"));
        person.setCity(resultSet.getString("city"));
        person.setId(resultSet.getInt("id"));
        return person;
    }
}
