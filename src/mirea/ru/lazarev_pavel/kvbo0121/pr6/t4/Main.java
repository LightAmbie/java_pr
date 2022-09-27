package mirea.ru.lazarev_pavel.kvbo0121.pr6.t4;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer(12000);
        Television tv = new Television(30000);

        System.out.println(comp.getPrice());
        System.out.println(tv.getPrice());
    }
}
