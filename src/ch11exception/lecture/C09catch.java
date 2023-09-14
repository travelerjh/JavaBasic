package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        try {
            int [] arr= {1,0};

            // !!!!!!  arr[0] ,arr[1],arr[2] 각각  넣어보면 실행 값이 다르다. !!!!!
            int i = 3/arr[1]; //예외가 발생할수 있다.
            //예상되는 예외가 1개 이상일 수 도 있다.
            // 그러면 catch 안에 여러가지의 예외를 넣으면 된다.
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("실행 흐름 이어감");
    }
}
