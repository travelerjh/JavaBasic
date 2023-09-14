package ch11exception.book.b7;

public class Ex {
    public static void main(String[] args) {
        try {
            find();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static  void find()throws  ClassNotFoundException{
        Class.forName("java.lang");
    }
}
