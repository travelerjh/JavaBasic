package basic10.book;

public class B03SuperAir  extends  B03Airplane{
    public static final int NOMAL=1;
    public static final int SUPERSONIC=2;

    public int flymode= NOMAL;

    @Override
    public void fly() {
    if(flymode==SUPERSONIC) {
        System.out.println("초음속모드 입니다");
    }else
        super.fly();
    }
}
