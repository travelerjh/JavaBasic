package ch11exception.book.b4;

public class Ex {
    public static void main(String[] args) {

        String[] arr= {"10","2a"};
        int val= 0;
        for (int i=0;i<=2;i++){
            try {
                val = Integer.parseInt(arr[i]);

            }catch (ArrayIndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println(val);
            }

        }



    }



}
