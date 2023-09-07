package ch13.book.b4;

public class Ex {
    public static void main(String[] args) {
        Container<String,String> container1 = new Container<>();
        container1.setV("홍길동","도적");
        String name1 = container1.getT();
        String job =container1.getV();

        Container<String ,Integer> container2 = new Container<>();
        container2.setV(30, "홍길동");
        String name2= container2.getT();
        int age= container2.getV();

    }
}
