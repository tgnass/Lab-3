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
			String word = input.nextLine();
			stack.push(word);
		}

		input.close();

		System.out.println("In reverse order:");
		reverseWordOrder(stack);
	}
	
	public static void reverseWordOrder(Stack<String> stack) {
		Stack<String> reverseStack = new Stack<>();
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			reverseStack.push(stack.peek());
			stack.pop();
		}
	}
}
