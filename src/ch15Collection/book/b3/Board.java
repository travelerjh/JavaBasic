package ch15Collection.book.b3;

public class Board {
    private String name;
    private String title;

    public Board(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
