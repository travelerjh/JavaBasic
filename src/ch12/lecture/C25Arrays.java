package ch12.lecture;

import java.util.Arrays;

public class C25Arrays {
    public static void main(String[] args) {
        int[] arr1 ={3,5,7,1,2};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //참조 타입일 경우
        Student[] arr2 ={new Student("이강인"),new Student("손흥민"),new Student("김민재"),};
        Arrays.sort(arr2,(x,y)->x.getName().compareTo(y.getName()));
        System.out.println(Arrays.toString(arr2));


    }
}

class  Student {
    private  String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
