package mirea.ru.lazarev_pavel.kvbo0121.pr28.tr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Original HashSet: " + set);

        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        System.out.println("Sorted HashSet " + list);
     }
}
