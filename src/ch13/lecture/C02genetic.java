package ch13.lecture;

public class C02genetic {
    public static void main(String[] args) {
        // 참조 타입만 가능하다
        Myclass02<Object> o1 = new Myclass02<Object>();
        Myclass02<String> o2 = new Myclass02<String>();
        Myclass02<Integer> o3 = new Myclass02<Integer>();
        Myclass02<Boolean> o4 = new Myclass02<Boolean>();
        Myclass02<Boolean> o5 = new Myclass02<>(); // 생략 가능!



    }
}
class  Myclass02<T>{
    private  T a; // 꺼낼때 문제가 생길수 있음
                        // 타입을 Object 로 두지말고
                        // 나중에 만들자
                        //  ===> 제네릭타입이 나옴  타입은<T>
}

