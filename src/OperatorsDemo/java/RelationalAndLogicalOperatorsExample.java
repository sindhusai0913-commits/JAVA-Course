package OperatorsDemo.java;

public class RelationalAndLogicalOperatorsExample {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 12;
        int x = 16, y = 10;
        // boolean result = x < y && a < b; // both the condition are true it will return true
        /* if any one of them is false ot will return false ==> it is and operator

         */
        boolean result = x < y || a < b;// both the condition are true it will return true
        /* if any one of them is false it ill return true ==> it is or operator

         */
        /* Relational operators:
         <>|=!
         == it used to compare btw the values

//     int x = 6, y = 6;
//     boolean result = x < y;*/
    System.out.println(result);

    }
}
