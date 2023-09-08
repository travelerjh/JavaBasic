package ch15Collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C03cotain {
    public static void main(String[] args) {
        List<String> list1  = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("spring"));

       boolean c1 =  list1.contains(new String("java"));
        System.out.println(c1); //t

        List<Myclass03> list2 = new ArrayList<>();
        list2.add(new Myclass03("흥민"));
        list2.add(new Myclass03("강인"));

        boolean c2 = list2.contains(new Myclass03("승민"));
        System.out.println(c2); //false
    }
}


class  Myclass03{
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Myclass03 myclass03 = (Myclass03) o;

        if (name != null ? !name.equals(myclass03.name) : myclass03.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Myclass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
