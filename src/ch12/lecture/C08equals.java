package ch12.lecture;

public class C08equals {
    public static void main(String[] args) {
        Myclass08 m8 = new Myclass08("이강인");
        Myclass08 m9 = new Myclass08("이강인");
        Myclass08 m10 = new Myclass08("김민재");

        System.out.println(m8==m9);
        System.out.println(m8.equals(m9));
        System.out.println(m8==m10);
        System.out.println(m8.equals(m10));
        System.out.println(m9==m10);
        System.out.println(m9.equals(m10));

    }
    // 잘 가져다 쓰자

}

class  Myclass08{
    private  String name;
    private  int age;

    public Myclass08(String name) {
        this.name = name;
    }

    //해석 할 필요는 없다.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Myclass08 myclass08 = (Myclass08) o;

        if (age != myclass08.age) return false;
        return name != null ? name.equals(myclass08.name) : myclass08.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}