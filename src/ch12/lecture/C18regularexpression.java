package ch12.lecture;

public class C18regularexpression {
    public static void main(String[] args) {
        //정규 표현식
        // 문자열에 패턴을 나타내는 기호들
        // 문자   바로 앞에 패턴이 반복 된다.
        System.out.println("x".matches("x")); //true
        System.out.println("D".matches("D")); //true
        System.out.println("a".matches("x"));//false

        // 문자들
        System.out.println("xxxx".matches("xxxx"));//true
        System.out.println("asd".matches("asd"));//true
        System.out.println("xxx".matches("x"));//false

        //수량 :
        System.out.println("xxx".matches("x{3}"));//true =xxx
        System.out.println("aaa".matches("a{3}"));//true =aaa
        System.out.println("aaa".matches("a{2}"));//false =aa
        // 몇번이든 반복되면 됨
        System.out.println("aaa".matches("a{1,5}"));//true a가 1번이든 5번이든 나와도됨

        System.out.println("dog".matches("do{1,3}g"));  //true
        System.out.println("doog".matches("do{1,6}g}"));//true
        System.out.println("dooog".matches("do{1,6}g}"));//true

        System.out.println("dododog".matches("do{1,6}g}"));//false

        //그룹화   == > ( do  ){ 1,4 } 이런식으로 묶는다.
        System.out.println("dododog".matches("(do){1,6}g}"));//false

        //수량 :  1개이상 , 3개 이상  { 1, } 끝 숫자를 안지정해버려
        System.out.println("dog".matches("do{1,}g") );// true
        System.out.println("dooooooog".matches("do{1,}g") );// true

        //   -->   ?   없거나 한번
        System.out.println("dg".matches("do?g"));//true 없거나 한번 이라 트루
        System.out.println("dog".matches("do?g"));//true  한번있어서 이라 트루
        System.out.println("doog".matches("do?g"));//false  두번있어서 이라 거짓

        //문자 들
        System.out.println("dog".matches("do[io]g"));//true
        System.out.println("dig".matches("do[oi]g"));// [ ] o 거나 i 면 f

        System.out.println("dog".matches("d[^oi]"));//  ^  = 아니라는뜻 fasle
        System.out.println("dsg".matches("d[^oi]"));//  ^  = 아니라는뜻 ture

        // a[a-z ]
        System.out.println("dag".matches("do[a-z]g")) ;//true
        System.out.println("dag".matches("do[a-dt-z]g")) ;//a~d ,t~z //true

        //문자분류 기호
        System.out.println("0".matches("[0-9]"));
        System.out.println("0".matches("\\d"));// 자바에서 역슬레시 쓸꺼면 \d \\d로 써라
        System.out.println("7".matches("[0-9]"));
        System.out.println("7".matches("\\d"));// 자바에서 역슬레시 쓸꺼면 \d \\d로 써라

        System.out.println("a".matches("[a-zA-Z_0-9]"));
        System.out.println("_".matches("\\w"));
        System.out.println("8".matches("\\w"));

        //예제 숫자로 시작하면 안되고 , 영문대소문자 ,_,$
        //String p ="[a-zA-Z_$][a-zA-Z_$0-9]";
        System.out.println("asd".matches("^\\d\\w"));

        //전화번호 패턴
        //2~3로 시작
        String phone ="[\\d]{2,3}[-][\\d]{4}[-][\\d]{4}";
        System.out.println("010-5146-8004".matches(phone));

        //모든 문자
        System.out.println("".matches("."));

        // . 만 표현 하고 싶을떄
        System.out.println(".".matches("\\."));

        //이메일 패턴
        //영어 소문자 , 숫자 여러개 @  영어소문자
        String email= "[a-z\\d]{6,15}[@]{1}[a-z]{3,6}[\\.][a-z]{2,3}";
        System.out.println("cjhee0601@naver.com".matches(email));

        // or  "  |   "  --> 역슬래쉬
        System.out.println("sfwedog".matches(".*dog.*")); //t
        System.out.println("sfqecatqweqwe".matches(".*cat.*"));//t
        // 개나 고양이가 있는지 확인 가능하다.
        System.out.println("sfwedog".matches(".*dog|cat.*")); //t
        System.out.println("sfqecatqweqwe".matches(".*cat|dog.*"));//t

        //한글 패턴
        System.out.println("zopzip".replaceAll("zo[\\w]p","zp"));

    }
}
