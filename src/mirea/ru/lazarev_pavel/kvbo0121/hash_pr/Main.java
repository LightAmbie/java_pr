package mirea.ru.lazarev_pavel.kvbo0121.hash_pr;

import java.util.Hashtable;

public class Main {
    static Hashtable<String, Object> map;

    public static void main(String[] args) {
        hashTabInit();
        hashTabAdd("horse", 4);
        hashTabAdd("zebra", "white");
        System.out.println(hashTabLookUp("zebra"));
        System.out.println(hashTabHash());
        System.out.println(map);
        hashTabDelete("zebra");
        System.out.println(map);

    }

    static int hashTabHash() {
        return map.hashCode();
    }

    static void hashTabInit() {
        map = new Hashtable<>();
    }

    static void hashTabAdd(String key, Object value) {
        map.put(key, value);
    }

    static Object hashTabLookUp(String key){
        return map.get(key);
    }

    static void hashTabDelete(String key){
        map.remove(key);
    }
}
