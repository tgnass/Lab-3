import java.util.Scanner;
import java.util.Stack;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter seven words at the prompts.");
		for(int i = 1; i <= 7; i++) {
			System.out.print("Enter a word: ");
			String word = input.next();
			stack.push(word);
			input.nextLine();
		}
		input.close();

		Stack<String> reverseStack = reverseWordOrder(stack);
		System.out.println("In reverse order:");

		for(int i = 0; i < stack.size(); i++) {
			System.out.println(reverseStack.peek());
			reverseStack.pop();
		}

	}
	
	public static Stack<String> reverseWordOrder(Stack<String> stack) {
		Stack<String> reverseStack = new Stack<>();
		for(int i = 0; i < stack.size(); i++) {
			reverseStack.push(stack.peek());
			stack.pop();
		}
		
		return reverseStack;
	}

}
