package DatabaseInterface;

public class Mysql implements Database {

    @Override
    public void connect() {
        System.out.println("MySql is connected successfully!");
    }
}

