package ch11exception.book.b3;

public class Ex {
    public static void main(String[] args) {
        String[] arr = {"100","1oo"};
        for (int i=0; i<=arr.length;i++){
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr["+i+"]:"+value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e ){
                System.out.println(
                        e.getMessage()
                );
            }

        }



    }
}
