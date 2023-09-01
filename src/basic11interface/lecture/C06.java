package basic11interface.lecture;

public class C06 {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setW(new Gun());
        hero.attack();

        hero.setW(new Arrow());
        hero.attack();
    }
}

class Hero{
    private int age;
    private Weapon w;
    public void setW(Weapon w) {
        this.w = w;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void attack(){
        w.trigger();
    }

}

interface Weapon  {
    void trigger();
}
class Gun implements  Weapon{
    @Override
    public void trigger() {
        System.out.println("총을쏩니다");
    }
}
class Arrow implements Weapon{
    @Override
    public void trigger() {
        System.out.println("활을 쏩니다.");
    }
}