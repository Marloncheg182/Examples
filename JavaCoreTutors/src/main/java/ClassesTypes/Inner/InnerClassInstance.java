package ClassesTypes.Inner;

/**
 * Created by O1e6 <NsN> on 12/22/2015.
 */
public class InnerClassInstance {
    class InnerClass1{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class InnerClass2{
        private String dest;
        InnerClass2(String whereTo){
            dest = whereTo;
        }
        String readLabel(){
            return dest;
        }
    }

    public static void main(String[] args) {
        InnerClassInstance p = new InnerClassInstance();
        InnerClassInstance.InnerClass1 c = p.new InnerClass1();
        InnerClassInstance.InnerClass2 d = p.new InnerClass2("Ukraine");
    }
}
