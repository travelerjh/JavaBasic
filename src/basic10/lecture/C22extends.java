package basic10.lecture;

public class C22extends {
    public static void main(String[] args) {
         MySub22 mySub22= new MySub22();
    }
}

class  My22{
    //생성자를 만들자.
    My22(){
        //초기화하는 코드들 작성됨
        System.out.println("상위클래스 초기화 코드");
    }


}
class  MySub22 extends  My22{
    MySub22 (){
        //상위 클래스 생성자 호출(초기화하는 코드)
        super(); // 꼭있어야함
                 // 안쓰면 자동삽입
        System.out.println("하위클래스 초기화 코드");
        //MySub22 인스턴스 필드 초기화 코드작성됨

    }

}