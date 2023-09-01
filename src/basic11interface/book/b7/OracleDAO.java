package basic11interface.book.b7;

public class OracleDAO implements DAO {
    @Override
    public void delete() {
        System.out.println("OracleDAO.delete");
    }

    @Override
    public void insert() {
        System.out.println("OracleDAO.insert");
    }

    @Override
    public void select() {
        System.out.println("OracleDAO.select");

    }

    @Override
    public void update() {
        System.out.println("OracleDAO.update");
    }
}
