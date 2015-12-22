package ClassesTypes.Object;

import java.util.Date;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
class Enemy {
    public void mungeFunc(SideEffectsClone sdf) {
        System.out.println("Object is " + sdf);
        sdf.year = 0;
        sdf.date.setYear(71);
    }
}

public class SideEffectsClone implements Cloneable {
    public Date date;
    volatile int year;

    public static void main(String[] args) throws CloneNotSupportedException {
        new SideEffectsClone().process();
    }

    SideEffectsClone() {
        date = new Date();
        year = date.getYear();
    }

    public void process() throws CloneNotSupportedException {
        Enemy enemy = new Enemy();
        System.out.println("We have seen the enemy, and he is " + enemy);

        System.out.println("Today is " + date);

        System.out.println("And the year is " + year);
        enemy.mungeFunc((SideEffectsClone) this.clone());
        System.out.println("Why, I believe it is now " + date);
        if(year == 0){

            System.out.println("** PANIC IN YEAR ZERO **");

        }

        System.out.println("But wait, the year is still " + year);

        enemy.mungeFunc(this);

        System.out.println("Now I'm certain that it's " + date);

        System.out.println("Now the year is  " + year);
    }
}
