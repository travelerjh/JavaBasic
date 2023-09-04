package basic11interface.book.b13;

public class Ex {
    public static void main(String[] args) {

        //스테틱 없음 객채 만들어서 불러와야함

        Service s= new Servielmpl();

        s.dM1();
        System.out.println();
        s.dM2();
        System.out.println();

        //스테틱이 들어가서  바로 받아올수 있음



        Service.sM1();
        Service.sM2();

    }



}
