package mirea.ru.lazarev_pavel.kvbo0121.pr6.t4;

public class Computer implements Priceble{
    private final int price;

    public Computer(int price) {
        this.price = price;
    }

    @Override
    public String getPrice() {
        return "Computer`s price: " + price;
    }
}
