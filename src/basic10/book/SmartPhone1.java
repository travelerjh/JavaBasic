package basic10.book;

public class SmartPhone1 extends P1{
    public boolean wifi;
    public SmartPhone1(String model,String color){
        this.model= model;
        this.color= color;
    }
    public  void  setWifi(boolean wifi){
        this.wifi =wifi;
        System.out.println("와이파이상태변경");
    }

    public void internet(){
        System.out.println("인터넷 연결합니다");
    }
}
