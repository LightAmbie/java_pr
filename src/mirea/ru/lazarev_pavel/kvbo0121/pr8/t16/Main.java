package mirea.ru.lazarev_pavel.kvbo0121.pr8.t16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(rec(0, 1));
    }
    public static int rec(int max, int maxCnt){
        int n = new Scanner(System.in).nextInt();
        if (n == 0) return maxCnt;
        if (n == max) maxCnt++;
        else if (n > max) {
            max = n;
            maxCnt = 1;
        }
        return rec(max, maxCnt);
    }
}
