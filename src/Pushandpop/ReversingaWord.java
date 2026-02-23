package Pushandpop;

import java.util.Stack;

public class ReversingaWord {
    public static void main(String[] args) {
        String Word = "SAI SINDHU";
        Stack <Character> Letter = new Stack<>();
        for(int i=0; i<Word.length(); i++) {
            Letter.push(Word.charAt(i));
        }
        StringBuilder reverse = new StringBuilder();
        while(!Letter.isEmpty())
            reverse.append(Letter.pop());
        System.out.println("Reverse a String " +reverse.toString());


    }
}
