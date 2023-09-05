package ch12.book.d1;

public class Smartphone {
    private  String company;
    private String os;


    //생성자
    public Smartphone(String company,String os){
        this.company =company;
        this.os =os;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
