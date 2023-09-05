package ch16lambad.lecture;

public class C15indexOf {
    //indexOf 특정 문자열이 시작하는 위치 리턴
    public static void main(String[] args) {

    String a = "spring";
   int index = a.indexOf("ring");
        System.out.println(index);
        System.out.println(a.indexOf("pr"));

    String b="spring is spring ";
        System.out.println("ring"); //첫번째 발견된거 리턴
    //특정 위치부터 찾고 싶다.
        int index1=b.indexOf("ring",2);//2
        System.out.println(index1);
        int index2=b.indexOf("ring",3);//12
        System.out.println(index2);

    }
}
