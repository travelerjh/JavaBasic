package ch12.book.d4;

public class Student {
    private  String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return studentNum != null ? studentNum.equals(student.studentNum) : student.studentNum == null;
    }

    @Override
    public int hashCode() {
        return studentNum != null ? studentNum.hashCode() : 0;
    }
}
