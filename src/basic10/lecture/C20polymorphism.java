package basic10.lecture;

public class C20polymorphism {
    public static void main(String[] args) {
        Item item = getItem();
        getItem();
        item.printDesc();


        System.out.println("게임 종료");
    }

    private static Item getItem() {
        double d= Math.random();
        if(d<0.5){
            return new Potion();
        } else {
            return new Map();
        }
    }
}

class Item{
    public void printDesc(){
        System.out.println("아이템 입니다.");
    }
}
class  Potion extends Item{
    @Override
    public void printDesc() {
        System.out.println("물약으로 체력을 체워줍니다");
    }
}

class Map extends Item{
    @Override
    public void printDesc() {
        System.out.println("지도가 있습니다.");
    }
}