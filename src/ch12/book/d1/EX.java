package ch12.book.d1;

public class EX {
    public static void main(String[] args) {
        Smartphone sm = new Smartphone("삼성전자 ", "안드로이드 ");
        String  str = sm.toString();
        System.out.println(str);
        System.out.println(sm);
    }
}
