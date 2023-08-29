package basic10.lecture;

public class C12poly {
    public static void main(String[] args) {
        Marlamu dog= new Marlamu();
        Animail ani =dog;
        ani.brethe();



    }
}
class Animail{
    public  void  brethe(){
        System.out.println("숨쉬다");
    }
}
class Marlamu extends  Animail{

}
