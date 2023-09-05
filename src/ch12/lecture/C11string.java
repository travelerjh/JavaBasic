package ch12.lecture;

public class C11string {
    public static void main(String[] args) {

    //문자열을 저장하는 타입
    String a =" java";
    String b =" java";
    String c = new String (" java");   //

        System.out.println(a==b); //참조값 값다
        System.out.println(a==c);// 참조값 다른다.
                                //확인하려면 equlas 를 사옹한다.
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }

}
