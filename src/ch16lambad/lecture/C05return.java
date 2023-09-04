package ch16lambad.lecture;

public class C05return {
    public static void main(String[] args) {
        Myinterface05 m5 =()->{
            System.out.println("명령문");
            System.out.println("명령문");
        return 0;
        };
        //Myinterface05 o2=()-> {return 0};
        Myinterface05 o2=()->  0;




    }

}

@FunctionalInterface
interface Myinterface05{
    int method();
}

// 고전적인 방법으로 구현 한다면

class  My05 implements Myinterface05{
    @Override
    public int method() {
        return 1;

    }
}