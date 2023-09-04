package ch16lambad.book.b8;

public class MethodEx {
    public static void main(String[] args) {
        Person p = new Person();
        p.action(Computer::staticMethod);


    Computer com =new Computer();
    p.action(com::instanceMethod);

    }

}
