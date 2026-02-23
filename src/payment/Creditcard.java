package payment;

public class Creditcard implements payment{


    @Override
    public void pay(int amount) {
        System.out.println(" Creditcard payment was " +amount+ " success");
    }
}
