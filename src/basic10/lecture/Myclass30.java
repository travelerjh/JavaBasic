package basic10.lecture;

public class Myclass30 {
    private void privateMtethod() {
        System.out.println("MYclass30");
    }

    public void publicMethod() {
        System.out.println("publicMethod");
        privateMtethod(); // 생성자 , 필드 , 메서드 다 포함
    }

    void pack() { //같은 패키지 내에서 사용 가능
        System.out.println("pack");
    }


    protected void protect(){
        System.out.println("portect");
    }

}
//하나의 파일 안에는 하나의 public 만들어간다.

