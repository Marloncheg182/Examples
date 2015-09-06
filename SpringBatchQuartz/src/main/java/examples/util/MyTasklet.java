package examples.util;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
public class MyTasklet implements Tasklet {
    private DataSource dataSource;
    private String sql = "select firstName, lastName, school from Person;";

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List person = new ArrayList();
        JdbcTemplate myTemplate = new JdbcTemplate(getDataSource());
        person = myTemplate.query(sql, new PersonMapper());
        for (Person p : person) {
            System.out.println(p);
        }
        return RepeatStatus.FINISHED;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
