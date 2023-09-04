package ch16lambad.book.b3;

public class button {
    public static interface ClickListnenr{
       void onClick();
    }

    private  ClickListnenr clickListnenr;
    public  void  SetClickListener(ClickListnenr clickListnenr){
        this.clickListnenr = clickListnenr;
    }

    public void click(){
        this.clickListnenr.onClick();
    }

}
