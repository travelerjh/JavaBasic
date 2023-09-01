package basic11interface.book.b7;

public class DaoExample {
    //일단 DAO dao 이거 잘모르는 듯해

    public  static  void  dbWork(DAO dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void dbWork(DAOClass c) {
        c.method1();
    }

    public static void main(String[] args) {
        dbWork(new OracleDAO());
        dbWork(new MysqlDAO());
    }

}
