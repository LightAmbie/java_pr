package mirea.ru.lazarev_pavel.kvbo0121.pr20.tr1;

import java.io.Serializable;

public class JustAGenericClass <T extends Comparable<T>, V extends Serializable & Animal, K>{
    private T t;
    private V v;
    private K k;

    public JustAGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames(){
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }
}
