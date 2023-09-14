package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {

        //런타임을 제외하면 모두 검사한다.
        //그냥 예외처리는 꼭 try catch
        //명시를 꼭해야한다.

        System.out.println("main code1");

        //m4() throws Exception
        // 이거에 대해서 문제가 발생한다.

        try {
            m4();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main code2");

    }

    //반드시 명시를 해야한다.
    // m4 는 문제가 생긴다. .
    // 체크ed
    private static  void m4() throws Exception{
        throw  new Exception();
    }




    //해도 되고 안해도된다.
    private static  void m3(){
        throw  new RuntimeException();
    }

}
