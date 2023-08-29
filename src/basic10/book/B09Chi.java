package basic10.book;

public class B09Chi {
    public static void main(String[] args) {
        B09Child child = new B09Child();
        B099Parent parent =child;

        parent.method();
        parent.method2();

    }
}
