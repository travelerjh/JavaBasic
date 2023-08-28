package basic09Class;

public class d0903array {
    public static void main(String[] args) {
        int[] a= {3,4,5};

        System.out.println("a[0] = " + a[0]);
   
        a= method();
        System.out.println("a[0] = " + a[0]);
        
    }
    
   public static int[] method(){
      int[] k = {22,33};
        return k;
   } ;
}
