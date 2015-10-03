
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler Gnass
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String newSentence = input.nextLine();
        input.close();
        System.out.println("Reversing each word:");
        String words[] = newSentence.split(" ");
        for (int i = 0; i < words.length; i++) {
        	String word = words[i];
        	System.out.print(reverseString(word));
        	
        	if (i < words.length - 1) {
        		System.out.print(" ");
        	}
        }
    }
    
    private static String reverseString(String newString) {
        Stack<Character> stack = new Stack<>();
        String output = "";

        for(int i = 0; i < newString.length(); i++) {
        	stack.push(newString.charAt(i));
        }
        
        while(!stack.isEmpty()) {
        	Character ch = stack.pop();
        	output = output + ch;
        }
        
        return output;
    }
    
}
