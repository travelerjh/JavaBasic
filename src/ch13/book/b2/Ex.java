package ch13.book.b2;

public class Ex {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setG("홍길동");
        String str = container1.getG();
        System.out.println(str);

        Container<Integer> container2 = new Container<>();
        container2.setG(30);
        int v =container2.getG();
        System.out.println(v);

    }

}
