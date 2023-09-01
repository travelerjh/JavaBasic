package basic11interface.book.b7;

public class MysqlDAO implements  DAO{
    @Override
    public void update() {
        System.out.println("MysqlDAO.update");
    }

    @Override
    public void select() {
        System.out.println("MysqlDAO.select");
    }

    @Override
    public void insert() {
        System.out.println("MysqlDAO.insert");
    }

    @Override
    public void delete() {
        System.out.println("MysqlDAO.delete");
    }
}
