package ch13.book.b1;

public class Ex {
    public static void main(String[] args) {
        Box<String> b1 =new Box<>();
        b1.content ="안녕하세요 ";
        String str =b1.content;
        System.out.println(str);

        Box<Integer> b2 =new Box<>();
        b2.content= 333;
        Integer i = b2.content;
        int v  = b2.content;
        System.out.println(i);
        System.out.println(v);

    }
}
