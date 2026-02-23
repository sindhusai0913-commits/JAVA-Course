package payment;

public class DebitCard implements payment{

    @Override
    public void pay(int amount) {
        System.out.println("Debit Card payment is " +amount + " SUCCESS");
    }
}
