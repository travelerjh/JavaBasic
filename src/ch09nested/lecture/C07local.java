package ch09nested.lecture;

public class C07local {
    void m(){
        final int value=0;
        //안에서 밖에 변수를 사용할수도 있다 .
        //로컬 클래스에서 사용되는
        //감싸고 있는 메소드의 지연변수는
        //값을 변경할 수 없다. (final)
       // 상수로 처리되야 한다.

        class loacl{
          void metho1(){
              System.out.println(value);
          }

          // x 인 파라미터는 변경될 수 없다. 파이널 호출할때 한번 받고 끝

          void m2( int x){}



        }


    }

}
