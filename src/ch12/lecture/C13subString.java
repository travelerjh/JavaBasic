package ch12.lecture;

public class C13subString {
    //subString :부분문자열 추출
    //하나만 받으면 시작부터 끝까지
    public static void main(String[] args) {


    String a = "spring ";
    String b=a.substring(0,2); // 시작은 같이 끝은 포하 하지 않는다.
                             // su 까지 추출
        System.out.println(b);

    }

}
