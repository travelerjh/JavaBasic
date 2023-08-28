package basic09Class;

public class d0902class {
    public static void main(String[] args) {
        Myclass3  m3 = new Myclass3();
        m3.address="서울시청";
        System.out.println("m3.address = " + m3.address);
        
        m3 =method1();
        System.out.println("m3.address = " + m3.address);
        

    }


    public static Myclass3 method1(){
    Myclass3 p = new Myclass3();
      p.address="jeju";
        return p;
    }
    
}



class  Myclass3 {
    String address;
}



