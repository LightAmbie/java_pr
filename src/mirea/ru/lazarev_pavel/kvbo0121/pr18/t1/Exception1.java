package mirea.ru.lazarev_pavel.kvbo0121.pr18.t1;

public class Exception1 {
    public static void main(String[] args) {
        try{
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Zachem na nolb delish???");
        }
    }
}
