package ch16lambad.book.b9;

public class Member {
    String id;
    String name;

    public Member(String id) {
        this.id =id;
        System.out.println("Member(String id)");
    }
    public  Member(String id ,String name){
        this.id=id;
        this.name=name;
        System.out.println("Member(String id ,String name");
    }

    // 설명해주는 ?
    public String toString(){
        String info = "{id : "+id +"name: "+name +"}";
        return info;
    }
}
