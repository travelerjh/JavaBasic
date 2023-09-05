package ch12.lecture;

public class C12String {
    public static void main(String[] args) {
        String a= "java";
        String b= "spring";
        String c= "hi jaehee"; //공백도 길이에 포함

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());


        //text block
        String e = """
              hello
              hi java
              신기 하지 ?
              못 참겠지 ?
              """;
        System.out.println(e.length());

    }
}
