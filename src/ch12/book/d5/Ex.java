package ch12.book.d5;

public class Ex {
    public static void main(String[] args) {
        String id ="8Angle1004";
        String regExp="([^\\d][\\w]){8,12}";
        boolean isMatch= id.matches(regExp);
        if(isMatch){
            System.out.println("ID 사용 가능");
        }else {
            System.out.println("ID 사용 불가");
        }




    }
}
