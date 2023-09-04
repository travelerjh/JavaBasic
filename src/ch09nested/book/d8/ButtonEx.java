package ch09nested.book.d8;

public class ButtonEx {
    public static void main(String[] args) {
        Button btn = new Button();

        class  Oklistener implements Button.ClickListener{
            @Override
            public void onclick() {
                System.out.println("버튼을 클릭했습니다.");
            }
        }
        btn.setClickListener(new Oklistener());
        btn.click();

        Button btnC =new Button();
        class CancelListener implements Button.ClickListener{
            @Override
            public void onclick() {
                System.out.println("취소버튼 눌렀습ㄴ디ㅏ.");
            }
        }
        btnC.setClickListener(new CancelListener());
        btnC.click();

    }
}
