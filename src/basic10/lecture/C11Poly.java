package basic10.lecture;

public class C11Poly {
    public static void main(String[] args) {
        
        String s="java";
        Object o =s; 
       // String t =o //x

        int v1 =s .hashCode();
        int v2 = s.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
    }
}
