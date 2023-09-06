package ch12.lecture;

public class C19hangul {
    public static void main(String[] args) {
        // 자바 문자는 unicode
        System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("해리케인".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("이강인".matches("[\uac00-\ud7a3]{3}"));
    }

    public static class C22 {
        public static void main(String[] args) {


        Integer i =30;
        Integer j= 30;

        int k=30;
        int l=30;

            System.out.println(l==k); //
            System.out.println(j==i); // 참조 값이 다르다 .

        }
    }
}
