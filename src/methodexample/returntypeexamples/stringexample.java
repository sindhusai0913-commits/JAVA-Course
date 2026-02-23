package methodexample.returntypeexamples;

public class stringexample {
    public static String sum()
    {
        String Msg = "Hi Sai";

        return Msg;
    }
    public static void greet1(String name)
    {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        String greet = sum();
        System.out.println(greet);
        greet1("Sai");
    }

}
