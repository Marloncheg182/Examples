package Behavioral.Observer.ObserverJava;

/**
 * Created by Dell on 6/18/2015.
 */
public class SubjectMainProcess {
    public static void main(String[] args) {


        Subject subject = new Subject();

        CurrentDisplay display = new CurrentDisplay(subject);

        subject.setMeasurements(80, 65, 30.4F);
        subject.setMeasurements(82, 70, 29.2F);
        subject.setMeasurements(78, 90, 29.2F);
    }
}
