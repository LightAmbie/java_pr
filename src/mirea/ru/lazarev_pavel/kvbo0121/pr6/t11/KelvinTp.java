package mirea.ru.lazarev_pavel.kvbo0121.pr6.t11;

public class KelvinTp implements Convertible<KelvinTp, CelsiusTp> {
    private double temperature;

    KelvinTp(){}
    public KelvinTp(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public KelvinTp convert(CelsiusTp convertible) {
        return new KelvinTp(convertible.getTemperature() + 273);
    }

}
