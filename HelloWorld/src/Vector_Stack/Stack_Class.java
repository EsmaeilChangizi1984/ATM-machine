package Vector_Stack;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack_Class {

	public static void main(String[] args) {
		
		Stack<String>stack = new Stack<>();
		
		stack.push("C++");
		stack.push("JAVA");
		stack.push("Python");
		stack.push("C");
		
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		
		Iterator <String>itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Element at the top : "+stack.peek());
		System.out.println("Position of JAVA : "+stack.search("JAVA"));
		System.out.println("Stack is empty ? : "+stack.empty());
		
	}

}
