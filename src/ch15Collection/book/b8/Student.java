package ch15Collection.book.b8;

public class Student {
    public   String name;
    public  int StudentNum;

    public Student(String name, int studentNum) {

        this.name = name;
        StudentNum = studentNum;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (StudentNum != student.StudentNum) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + StudentNum;
        return result;
    }
}
