package ch13.book.b4;

public class Container <T,V>{
    private  T t ;
    private  V v;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v, String 도적) {
        this.v = v;
    }
}
