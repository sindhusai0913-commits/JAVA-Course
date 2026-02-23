package stringexample;

public class Calculator {
    public static void main(String[] args) {
        String  str = new String("sai");
        System.out.println(str);
        StringBuilder s1 = new StringBuilder("HEllO");
        s1.append("World");
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer("sai");
        s2.append("sindhu");
        String a = "ALEXA";
        String b = "ALEXA";
        String s = " Vibha ";
        String c = "null";
        System.out.println(c);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println("Length of a String = " + a.length());
        System.out.println("Length of S string:  " + s.length());
        System.out.println("trim:" + s.trim());
        System.out.println("Length of S string:  " + s.length());
        System.out.println("Comparison" + a==b);
        System.out.println("Compare " + a.compareTo(b));
        System.out.println("Compare " + b.compareTo(a));

        System.out.println("Char at " + a.charAt(2));

    }
    


  }
