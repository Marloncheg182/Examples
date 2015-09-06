package com.springbatch.example.util;

import org.springframework.batch.core.ItemWriteListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/27/2015.
 */
public class WriterListener implements ItemWriteListener {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void beforeWrite(List items) {
        System.out.println("Going to write the following items: " + items.toString());
    }

    public void onWriteError(Exception e, List items) {
        System.out.println("Error occurred when writing items!");
    }

    public void afterWrite(List items) {
        System.out.println("Feeding the stats table");
        int result = 0;
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        for (User user : items) {
            Object[]params = {user.getFirstName(), user.getLastName(), user.getCity(), user.getId()};
            result +=jdbcTemplate.update("insert into user_stats(firstName,lastName,city,id) values (?,?,?,?)", params);
        }
        System.out.println("Number of rows inserted: "+ result);
    }

}
