package DatabaseInterface;

public class TestingDatabase {
    public static void main(String[] args) {

        Database d1 = new Mysql();
        d1.connect();
//        d1.disconnect();
        Database Db = new PostSql();
        Db.connect();
        Db.disconnect();
    }
}
