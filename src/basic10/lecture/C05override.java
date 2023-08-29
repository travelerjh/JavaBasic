package basic10.lecture;

public class C05override {
    // 만약 상속 받은 부모기능중에 맘에 들지 않는 부모기능이 있다면
    //  부모클래스에 메소드를 그대로 만들어서 오버라이딩 한다 . (재정의 )
    public static void main(String[] args) {
            My5 m5 =new My5();
            m5.mt1();
        System.out.println("-------------------");
            SubMy5 subm5 =new SubMy5();
            subm5.mt1();// 재정의한 메소드
            subm5.mt2();//새로만든 메소드

    }
}

class My5{
    public void mt1(){
        System.out.println("어떤기능");
    }
}
class SubMy5 extends My5{
    //메서드 재정의
    @Override
    public void mt1() {
        System.out.println("변경된기능");
    }

    public void mt2(){
        System.out.println("추가된기능");
    }

}
