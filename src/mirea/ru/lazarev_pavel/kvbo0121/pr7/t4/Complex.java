package mirea.ru.lazarev_pavel.kvbo0121.pr7.t4;

public class Complex {
    private int real;
    private int img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
}
