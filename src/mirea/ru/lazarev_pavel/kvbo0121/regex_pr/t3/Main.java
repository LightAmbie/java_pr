package mirea.ru.lazarev_pavel.kvbo0121.regex_pr.t3;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(isValidDate(in.nextLine()));
        }
    }

    final static Pattern pattern = Pattern.compile("^((29\\/02)\\/(((([2468][048])|([3579][26]))00)|(19|[2-9]\\d)((0[48])|([2468][048])|([13579][26]))))|((((([01]\\d)|2[0-8])\\/(0\\d)|(1[0-2]))|((29|30)\\/((0[1,3-9])|1[0-2]))|(31\\/((0[13578])|(1[02]))))\\/((19|[2-9]\\d)\\d\\d))$\n29");

    public static boolean isValidDate(String string) {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
