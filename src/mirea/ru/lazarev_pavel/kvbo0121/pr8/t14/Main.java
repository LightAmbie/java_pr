package mirea.ru.lazarev_pavel.kvbo0121.pr8.t14;

public class Main {
    public static void main(String[] args) {
        rec(123456);
    }

    public static void rec(int n){
        if (n == 0) return;
        int r = n % 10;
        rec(n / 10);
        System.out.println(r);
    }
}
