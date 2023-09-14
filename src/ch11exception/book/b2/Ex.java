package ch11exception.book.b2;

public class Ex {
public static  void  printLength(String data){
    //리턴 되더라도 실행된다.

    try {
        int res= data.length();
        System.out.println("문자수 :" +res);
    }catch (NullPointerException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("[마무리 실행]\n");
    }

}
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        //문제 없을떄
        printLength("thisisjava");
        //문제 있을떄
        printLength(null);


        System.out.println("[프로그램 종료]");

}
}
