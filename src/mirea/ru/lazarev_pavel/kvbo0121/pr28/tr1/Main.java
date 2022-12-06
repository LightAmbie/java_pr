package mirea.ru.lazarev_pavel.kvbo0121.pr28.tr1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("1 element");
        set.add("2 element");
        set.add("3 element");
        set.add("4 element");

        System.out.println("HashSet: " + set);

//        Set<String> hashSetToTreeSet = new TreeSet<>(set);
        Set<String> hashSetToTreeSet = new TreeSet<>();
        hashSetToTreeSet.addAll(set);


        System.out.println("TreeSet: " + set);
    }
}
