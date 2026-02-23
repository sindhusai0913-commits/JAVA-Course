package DatabaseInterface;

public interface Database {
    void connect();
// in interface we can create method body by using default methods
    default void disconnect()
    {
        System.out.println("Disconnecting from database...");
    }

}
