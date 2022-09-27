package mirea.ru.lazarev_pavel.kvbo0121.pr6.t11;

public class FahrenheitTp implements Convertible<FahrenheitTp, CelsiusTp> {
    private double temperature;

    FahrenheitTp(){}
    public FahrenheitTp(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public FahrenheitTp convert(CelsiusTp convertible) {
        return new FahrenheitTp(convertible.getTemperature() + 32);
    }

    public double getTemperature() {
        return temperature;
    }
}
