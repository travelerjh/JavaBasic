package ch11exception.book.b5;

public class Ex {
    public static void main(String[] args) {
        String[] arr = {"100","1oo",null,"200"};

        for (int i=0; i<=arr.length;i++){
            try {
                int val = Integer.parseInt(arr[i]);
                System.out.println("arr["+i+"] : "+ val);
            }catch (ArrayIndexOutOfBoundsException | NullPointerException |NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }


    }
}
