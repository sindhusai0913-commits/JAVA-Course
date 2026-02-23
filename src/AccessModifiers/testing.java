package AccessModifiers;

public class testing {
    public void Day ()
    {
        System.out.println("Private Access");

    }

    public static void main(String[] args) {
        testing s1 = new testing();
        s1.Day();
        sai s2 = new sai();
        s2.display();
    }

}
