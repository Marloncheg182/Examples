import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;


import java.util.List;

/**
 * Created by Dell on 6/10/2015.
 */
@DatabaseTable(tableName = "question")
public class Question {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "category", foreign = true)
    private Category category;
    @DatabaseField
    private String text;
    @DatabaseField
    private String img;
    @ForeignCollectionField
    private List<Answer> answers;


    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", category=" + category +
                ", text='" + text + '\'' +
                ", img='" + img + '\'' +
                ", answers=" + answers +
                '}';
    }


}
