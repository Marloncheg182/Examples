import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dell on 6/10/2015.
 */
public class QuestionService {
    public static void main(String[] args) {

    }
private final String url = "jdbc:sqlite:main.sqlite";
    private ConnectionSource connectionSource;
    private Dao<Question, String> dao;

    public QuestionService()throws SQLException{
        connectionSource = new JdbcConnectionSource(url);
        dao = DaoManager.createDao(connectionSource,Question.class);
    }
    public List<Question> getAll() throws SQLException
    {
        return dao.queryForAll();
    }
}
