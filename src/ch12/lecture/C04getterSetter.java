package ch12.lecture;

public class C04getterSetter {
    public static void main(String[] args) {

        Myclass04 m4 = new Myclass04();
        //  m4.name="손흥민 ";
        // m4.age=30;

        m4.setAge(33);
        m4.setName("손흥민");

        System.out.println(m4);
        System.out.println(m4.getName());

    }

}

class  Myclass04{
    private String name;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Myclass04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
