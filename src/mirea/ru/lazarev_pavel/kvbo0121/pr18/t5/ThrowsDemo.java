package mirea.ru.lazarev_pavel.kvbo0121.pr18.t5;

public class ThrowsDemo {
    public static String getDetails(String key){
        if(key==null){
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }

    public static void main(String[] args) {
        String a = null;
        try{
            System.out.println(getDetails(a));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
