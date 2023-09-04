package ch09nested.book.d10;

public class Home {
    private  Remote rm =new Remote() {
        @Override
        public void turnOn() {
            System.out.println("Tv 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("티비 끕니다.");
        }
    };
    public void  use1(){
        rm.turnOff();
        rm.turnOn();
    }
    public  void  use2(){
        Remote rm = new Remote() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 켭");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 끔");
            }
        };
        rm.turnOn();
        rm.turnOff();
    }

    public void  use3(Remote rc){
        rc.turnOff();
        rc.turnOn();
    }

}
