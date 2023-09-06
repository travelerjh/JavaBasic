package ch12.lecture;

public class C17repalceall {
    public static void main(String[] args) {
        //replaceAll : 특정문자열을 다른 문자열로 변경
        // 특정 패턴을 --> 다른 문자열로 변경하는 메소드
        String  a= "JAVA is java";
        String b= a.replace("java","spring");
        System.out.println(b);

        // BUT 대문자도 바꾹고 싶단 말이지

        String c= a.replaceAll("(java|JAVA)","spring");
        System.out.println(c);

    }

}


