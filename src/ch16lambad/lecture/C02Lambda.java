package ch16lambad.lecture;

public interface C02Lambda {
    // 어디선가
    // 람다는
    //  ( 파라미터 목록  ) -> {  메서드 몸통 }
    Myinterface02 o1 = ()->{
        System.out.println("m1");
        };
            Myinterface02 o2 =()-> System.out.println("m2");
       }

@FunctionalInterface
interface Myinterface02{
    //파라이터도 없고
    //리턴도 없다.

    void m1();
}
