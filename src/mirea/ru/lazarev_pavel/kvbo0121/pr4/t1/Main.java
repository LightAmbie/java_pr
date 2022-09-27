package mirea.ru.lazarev_pavel.kvbo0121.pr4.t1;

public class Main {
    public static void main(String[] args) {
        Season myFav = Season.WINTER;

        System.out.println("My favourite season: " + myFav);

        iLike(myFav);
        iLike(Season.SPRING);

        System.out.println(myFav.getDescription());

        myFav = Season.SUMMER;

        System.out.println(myFav.getDescription());
    }
    public static void iLike(Season season){
        switch (season){
            case AUTUMN -> System.out.println("I like autumn");
            case WINTER -> System.out.println("I like winter");
            case SPRING -> System.out.println("I like spring");
            case SUMMER -> System.out.println("I like summer");
        }
    }
}
