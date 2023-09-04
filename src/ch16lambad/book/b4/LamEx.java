package ch16lambad.book.b4;

public class LamEx {
    public static void main(String[] args) {
        Person p = new Person();
        p.action((name, job) -> {
            System.out.println(name);
            System.out.println(job);
        });

}
}
