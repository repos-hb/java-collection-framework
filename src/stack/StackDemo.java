package stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stackOfCards = new Stack<>();
		
		// method: push
		stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");
        
        System.out.println("Stack => " + stackOfCards);
        System.out.println();
        
        // method: pop
        String topCard = stackOfCards.pop();
        System.out.println("Stack.pop() => " + topCard);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();
        
        // method: peek
        System.out.println(stackOfCards.peek());

	}

}
