package ch12.book.d9;

public class InsufficientException extends Exception {
    public InsufficientException(){

    }
    public InsufficientException(String message){
     super(message);
    }
}
