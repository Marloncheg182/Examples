package ClassesTypes;

import java.util.Arrays;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(1,2,3,4);

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        OuterClass.StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();

        System.out.println(staticNestedClass.getName());
        staticNestedClass.d=10;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);

        OuterClass.InnerClass innerClass = outer.new InnerClass();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValies();
        System.out.println(innerClass);

        outer.print("Outer");

        System.out.println(Arrays.toString(outer.getFilesInDit("ClassesTypes", ".java")));
        System.out.println(Arrays.toString(outer.getFilesInDit("ClassesTypes", ".class")));
    }
}
