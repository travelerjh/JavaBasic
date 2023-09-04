package ch09nested.book.d8;

public class Button {

    //중첩 인터페이스
    public static interface  ClickListener{
        void  onclick();
    }
    private  ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener =clickListener;
    }

    public void  click(){
        this.clickListener.onclick();
    }

}
