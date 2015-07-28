package GOF.Behavioral.Observer;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        MySubject subject = new MySubject();

        Observer observer1 = new Subscriber("Observer 1");
        Observer observer2 = new Subscriber("Observer 2");
        Observer observer3 = new Subscriber("Observer 3");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        observer1.setSubject(subject);
        observer2.setSubject(subject);
        observer3.setSubject(subject);

        observer1.update();

        subject.postMessage("New Message");
    }
}
