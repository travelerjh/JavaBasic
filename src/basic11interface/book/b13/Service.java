package basic11interface.book.b13;

public interface Service {
    default  void dM1(){
        System.out.println("1 디폴드 종속 코드");
    }
    default  void dM2(){
        System.out.println("2 디폴드 종속 코드");
    }

    private  void common(){
        System.out.println("1프라이빗");
        System.out.println("2프라이빗");
    };

    static void sM1(){
        System.out.println("1정적");
        comm();
    }



    static void sM2(){
        System.out.println("1정적");
        comm();
    }

    private static void comm(){
        System.out.println("1프라이빗");
        System.out.println("2프라이빗");

    }

}
