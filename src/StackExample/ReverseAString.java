package StackExample;

import java.util.Stack;


public class ReverseAString {


    public static void main(String[] args) {
        String input = "JAVA";
        Stack<Character> Reverse = new Stack<>();
        // loop 1
         
        for(int i = 0; i < input.length(); i++)
            // calling a method and input
            Reverse.push(input.charAt(i));

        StringBuilder Reversed = new StringBuilder();
        while(!Reversed.isEmpty()){
            Reversed.append(Reverse.pop());
        }
        System.out.println("Original: " + input);
     System.out.println("Reversed : " + Reverse.toString());
    }





}
