package com.spring.examples.util;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class MyTasklet implements Tasklet {

    private DataSource dataSource;
    private String sql="SELECT FIRSTNAME, LASTNAME, SCHOOL, ROLLNUMBER FROM PERSON";

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List personList = new ArrayList();
        JdbcTemplate myTemplate = new JdbcTemplate(getDataSource());
        personList = myTemplate.query(sql, new PersonMapper());

        for (Person p : personList) {
            System.out.println(p.toString());
        }
        return RepeatStatus.FINISHED;
    }
    public DataSource getDataSource(){
        return dataSource;
    }
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
}
