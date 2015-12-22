package Util.Comparator;

/**
 * Created by Oleg Romanenchuk on 9/24/2015.
 */
public class Student {
    private String name;
    private int age;
    private String lesson;
    private int grade;

    public Student() {
    }

    public Student(String name, int age, String lesson, int grade) {
        super();
        this.name = name;
        this.age = age;
        this.lesson = lesson;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lesson='" + lesson + '\'' +
                ", grade=" + grade +
                '}';
    }
}
