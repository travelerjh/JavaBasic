package ch16lambad.book.b9;

public class Ex {
    public static void main(String[] args) {
        Person p = new Person();
        Member m1 = p.getMember1(Member::new);
        System.out.println(m1);
        System.out.println();

        Member m2=p.getMember2(Member::new);
        System.out.println(m2);
    }
}
