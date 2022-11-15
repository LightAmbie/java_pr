package mirea.ru.lazarev_pavel.kvbo0121.regex_pr.t1;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(isPrice(in.nextLine()));
        }
    }

    final static Pattern pattern = Pattern.compile("^\\d+(\\.\\d{2})? (USD|EU|RUB)$");

    public static boolean isPrice(String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
