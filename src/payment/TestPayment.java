package payment;

public class TestPayment {
    public static void main(String[] args)
    {
        payment p1 = new Creditcard();
        p1.pay(69000);
        payment p2 = new DebitCard();
        p2.pay(40000);
        payment p3 = new Upi();
        p3.pay(50000);
    }

}


