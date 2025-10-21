package LearnJava;

import java.util.ArrayList;

public class VarInJava {
    public static void main(String[] args) {
        var demo = new ArrayList<>();
        demo.add("Amit");
        demo.add(1234);
        demo.add('A');
        demo.add(true);
        demo.add(10.55);

        for( Object d :demo) {
            System.out.println(d);
        }
    }
}
