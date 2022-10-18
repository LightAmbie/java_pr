package mirea.ru.lazarev_pavel.kvbo0121.pr18.t2;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer");
            String s = scan.next();
            int i = Integer.parseInt(s);
            System.out.println(2/i);
        } catch (Exception e){
            System.out.println(e);;
        }

    }
}
