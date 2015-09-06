package com.springbatch.example.util;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public class UserRowMapper implements RowMapper {
    public User mapRow(ResultSet rs, int rowNumber) throws SQLException {
        User user = new User();
        user.setFirstName(rs.getString("firstName"));
        user.setMiddleName(rs.getString("middleName"));
        user.setLastName(rs.getString("lastName"));
        user.setCity(rs.getString("city"));
        user.setId(rs.getInt("id"));
        return null;
    }
}
