package ch11exception.book.b8;

public class Ex {
    public static void main(String[] args)throws  Exception {
    find();
    }
    public static void find() throws  ClassNotFoundException{
        Class.forName("javaisLinag");
    }
}
