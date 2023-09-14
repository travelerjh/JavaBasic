package ch11exception.book.b6;

public class Ex {
    public static void main(String[] args) {
        String [] arr= {"100","1oo"};

        for (int i =0; i<=arr.length;i++){
            try {
                int val = Integer.parseInt(arr[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }catch (Exception e ){
                System.out.println(e.getMessage());
            }
        }



    }
}
