package basic10.lecture;

public class C19polmorphism {
    public static void main(String[] args) {
        Hero19 h19 =new Hero19();
        h19.weapon= new Gun();
        h19.attack();

        h19.weapon=new Sword();
        h19.attack();

        System.out.println("게임 종료");


    }
}
//게임을 한다.
class Hero19 {
    public  Weapon weapon;
    public void attack(){
        weapon.shot();
    }
}

class  Weapon{
    public void shot(){
        System.out.println("무기를 사용합니다.");
    }
}

class  Gun extends  Weapon{
    @Override
    public void shot() {
        System.out.println("총을 쏩니다.");
    }
}
class  Sword extends Weapon{
    @Override
    public void shot() {
        System.out.println("검을 휘두릅니다");
    }
}