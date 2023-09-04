package ch16lambad.book.b2;

public class lambdaEx {
    public static void main(String[] args) {
        person person=new person();
        person.action(()-> System.out.println("출근합니다"));
        person.action(()-> System.out.println("프로그램 합니다"));
        person.action(()-> System.out.println("퇴근합니다"));




    }
}
