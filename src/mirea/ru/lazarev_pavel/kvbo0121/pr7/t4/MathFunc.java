package mirea.ru.lazarev_pavel.kvbo0121.pr7.t4;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double number, int p) {
        double result = 1;

        for (int i = 0; i < p; i++) {
            result*=number;
        }
        return result;
    }

    @Override
    public double compAbs(Complex z) {
        return Math.sqrt((z.getImg()*z.getImg())+(z.getReal()*z.getReal()));
    }

    @Override
    public double circumference(double radius) {
        return 2*PI*radius;
    }
}
