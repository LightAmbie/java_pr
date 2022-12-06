package mirea.ru.lazarev_pavel.kvbo0121.regex_pr.t5;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(isSecurePassword(in.nextLine()));
        }
    }

    final static Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])([\\w]){8,}$");

    public static boolean isSecurePassword(String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
