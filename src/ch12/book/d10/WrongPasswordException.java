package ch12.book.d10;

public class WrongPasswordException extends  Exception{
    public WrongPasswordException(){};
    public WrongPasswordException(String message){
        super(message);
    };
}
