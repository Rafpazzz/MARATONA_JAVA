package Java_Collections.test;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("red");
        a.add(0,"yellow");
        a.add("black");
        a.add(0,"Orange");
        a.remove(1);
        a.remove("red");
        a.addLast("gray");
        Object o = a.clone();
        System.out.println(o);
        a.ensureCapacity(2);
        for(String itens : a) {
            System.out.println(itens);
        }
    }
}
