package ch12.book.d2;

public class Member {
    String id;
    String name;

    public Member(String id, String name ){
        this.id=id;
        this.name =name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
