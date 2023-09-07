package ch13.lecture;

public class C04genetic {
    public static void main(String[] args) {
        Myclass04<String> o1= new Myclass04<>();
        o1.setField("java");
        String f1= o1.getField();

        Myclass04<Integer> o2 =new Myclass04<>();
        o2.setField(3000);
        Integer f2 = o2.getField();
        int f22 =o2.getField();

    }
}

class Myclass04<T> {
    private  T field ;

    public Myclass04() {
        this.field = field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}