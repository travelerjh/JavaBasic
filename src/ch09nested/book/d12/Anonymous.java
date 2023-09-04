package ch09nested.book.d12;

import java.lang.invoke.VarHandle;

public class Anonymous {
    Vehicle f = new Vehicle() {
        @Override
            public void run() {
                System.out.println("자전거가 달립니다.");
        }
    };

    void m1(){
        Vehicle v= new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        v.run();
    }
    void m2(Vehicle v){
        v.run();
    }

}
