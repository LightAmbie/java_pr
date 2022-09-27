package mirea.ru.lazarev_pavel.kvbo0121.pr6.t11;

public class Main {
    public static void main(String[] args) {
        CelsiusTp ctp = new CelsiusTp(13.2);

        FahrenheitTp ftp = new FahrenheitTp();
        KelvinTp ktp = new KelvinTp();

        System.out.println("Celsius temprature: " + ctp.getTemperature());

        System.out.println("Fahrenheit temperature: " + ftp.convert(ctp).getTemperature());
        System.out.println("Kelvin temperature: " + ktp.convert(ctp).getTemperature());
    }
}
