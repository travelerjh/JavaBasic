package basic10.book.b3;

public  abstract  class phone {
    //필드선언
    String owner;
     //todtjdwk tjsdjs
    phone(String owner){
        this.owner =owner;
    }
    void turnOn(){
        System.out.println("전원을 키다.");
    }
    void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
