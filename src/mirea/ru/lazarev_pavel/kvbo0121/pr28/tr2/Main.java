package mirea.ru.lazarev_pavel.kvbo0121.pr28.tr2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, String> map;

    static Map createMap() {
        map = new HashMap<>();
        map.put("Lazarev", "Pavel");
        map.put("Marchenko", "Sergei");
        map.put("Lazarev", "Ilya");
        return map;
    }

    static int getSameFirstNameCount() {
        for (String name :
                map.values()) {

        }
    }

}
