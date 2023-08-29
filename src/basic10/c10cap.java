package basic10;

public class c10cap     {

}

class My10{
    //필드생성
    // 특별한 이유가 없다면 private 으로

    private int age;
    private String name;


    // get으로 값을 가져온다 .
    // set으로 값을  보내준다.
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
