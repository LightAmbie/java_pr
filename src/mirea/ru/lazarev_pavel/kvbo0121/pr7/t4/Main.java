package mirea.ru.lazarev_pavel.kvbo0121.pr7.t4;

public class Main {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        Complex z = new Complex(4, -3);

        System.out.println(math.power(3,2));
        System.out.println(math.compAbs(z));
        System.out.println(math.circumference(4.2));
    }
}
