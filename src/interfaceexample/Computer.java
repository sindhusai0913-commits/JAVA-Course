package interfaceexample;

public class Computer implements Laptop  {

    @Override
    public void user() {
        System.out.println("Display the message in Laptop desktop");

    }
}
