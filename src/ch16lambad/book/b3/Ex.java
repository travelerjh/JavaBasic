package ch16lambad.book.b3;

public class Ex {
    public static void main(String[] args) {
        button b= new button();
        b.SetClickListener(()-> System.out.println("ok버튼을 눌렀습니다."));
        b.click();

        button bc =new button();
        bc.SetClickListener(()-> System.out.println("취소버튼을 눌렀습니다."));
        bc.click();
    }
}
