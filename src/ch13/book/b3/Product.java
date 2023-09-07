package ch13.book.b3;

public class Product <K,M>{
    private K kind;

    public Product(K kind, M model) {
        this.kind = kind;
        this.model = model;
    }

    private  M model;

    public Product() {

    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
