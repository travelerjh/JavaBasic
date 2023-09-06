package ch12.lecture;

public class C16replace {
    public static void main(String[] args) {
        // replace  ==> 특정 문자열을 다른 문자열로 변경한다.
        String a= "spring";
        String b=a.replace("sp","ab");
        System.out.println(a); //변경전
        System.out.println(b);// 변경후

        // 여러개도 바뀜
        String d= "java is java";
        String c =d.replace("java","spring ");

        System.out.println(d);
        System.out.println(c);

        //대소문자 구분
        String f= "JAVA is java";
        String s= f.replace("JAVA","Spring");
        System.out.println(s);

    }
}
