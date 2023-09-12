package ch15Collection.book.bb1;

public class Board {
    private  String Student;
    private  String content;

    public Board(String student, String content) {
        Student = student;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "Student='" + Student + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

