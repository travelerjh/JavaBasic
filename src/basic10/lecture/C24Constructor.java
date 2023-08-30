package basic10.lecture;

public class C24Constructor {
}



class My24{
    int age;
    My24(int age){
        this.age=age;
    }

}
class Mysub24 extends My24{
    Mysub24(){
        //명시적으로 상위 클래싀의 생성자 호출 코드 작성

        super(40);
    }


}

