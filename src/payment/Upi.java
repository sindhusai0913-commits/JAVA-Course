package payment;

public class Upi implements payment{
    @Override
    public void pay(int amount) {
        System.out.println("UPI Payment is " +amount+ " Success");
    }
}
