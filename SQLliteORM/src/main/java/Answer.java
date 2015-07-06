import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Dell on 6/10/2015.
 */
@DatabaseTable(tableName = "answer")
public class Answer {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "id_q", foreign = true)
    private Question question;
    @DatabaseField
    private String value;
    @DatabaseField
    private boolean correct;

    public Answer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + ", idQuestion=" + getId()
                + ", value=" + value + '\'' + ", correct=" + correct + '}';
    }
}
