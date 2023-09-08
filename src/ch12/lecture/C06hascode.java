package ch12.lecture;

public class C06hascode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        //문자는 이름이 같다면 주소값이 같다.
        //어떤 객채를 특정 값으로 변경시켜주는 걸 해시 함수라고 한다.
        //변경된값이 해시값

        System.out.println(o1==o2);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.equals(o2));


        System.out.println(o1==o3);
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());





    }
}
