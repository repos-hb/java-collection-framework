package stack;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {

		Stack<String> stackOfCards = new Stack<>();

		// method: push
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");
		
		// Check if the Stack is empty
		System.out.println(stackOfCards.isEmpty());
		
		// Find the size of Stack
		System.out.println(stackOfCards.size());
		
		// Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
		int position = stackOfCards.search("KING");
		
		if(position > -1){
			System.out.println(position);
		}
		else
			System.out.println("error");

	}

}
