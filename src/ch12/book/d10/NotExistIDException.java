package ch12.book.d10;

public class NotExistIDException extends Exception{

    public NotExistIDException(){}

    public NotExistIDException(String message){
        super(message);
    }
}
