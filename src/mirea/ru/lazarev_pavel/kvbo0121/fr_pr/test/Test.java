package mirea.ru.lazarev_pavel.kvbo0121.fr_pr.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning itr(cursor) will point to
        // index just before the first element in al
        Iterator<Integer> itr = al.iterator();

        // checking the next element availability
        while (itr.hasNext()) {
            // moving cursor to next element
            int i = itr.next();

            // getting even elements one by one
            System.out.print(i + " ");

            // Removing odd elements
            if (i % 2 != 0) itr.remove();
        }
        System.out.println();
        System.out.println(al);
    }
}


