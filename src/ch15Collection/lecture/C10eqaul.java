package ch15Collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C10eqaul {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("ja");
        set.add("ja");
        System.out.println(set.size());

        Set<MyClass11> my11= new HashSet<>();
        my11.add(new MyClass11("son"));
        my11.add(new MyClass11("son"));
        my11.add(new MyClass11("kim"));

        System.out.println(my11.size());// 3개가 아니고 eqauls 메소드 사용해서 2개


    }
}

class MyClass11 {
    private String name;

    public MyClass11(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass11 myClass11 = (MyClass11) o;

        return name != null ? name.equals(myClass11.name) : myClass11.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MyClass11{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
