package ch12.book.d9;

public class AccountExample {
    public static void main(String[] args) {

        Account ac= new Account();

        ac.deposit(10000);
        System.out.println("예금액"+ac.getBalance());

        try {
            ac.withdraw(200);
        } catch (InsufficientException e) {
            String message= e.getMessage();
            System.out.println(message);
        }
    }
}
