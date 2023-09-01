package basic11interface.lecture;

public class C09cast {
    //촌쵸니쵼초니
    public static void main(String[] args) {
        CharSequence c= "java";
        String s =(String) c ;
        Object o =(Object)c;
        System.out.println("프로그램 종료");
        //  Number n = (Number)c;\
        //  매우 위험 어제배운 instanceof 로  더블 체크하기 바래


    }
}
