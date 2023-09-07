package ch13.lecture;

import java.util.HashMap;

public class C05genetic {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        MyClass05<String,Integer> o1= new MyClass05<>();


    }
}
// 따로 따로 쓰고 싶을때 타입을 다른걸 넣어라
class MyClass05<T,U>{
    private  T field1;
    private  U field2;

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public U getField2() {

        return field2;
    }

    public void setField2(U field2) {
        this.field2 = field2;
    }
}
