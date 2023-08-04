package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Practice {

	public static void main(String[] args) {
		
		Queue <String> queue1 = new LinkedList<>();
		Queue <Integer>queue2 = new ArrayDeque<>();
		Queue <Double>queue3  = new PriorityQueue<>();
		
		PriorityQueue <String> myqueue = new PriorityQueue<>();
		
		
		queue2.add(1);
		queue2.offer(2);
		queue2.offer(3);
		queue2.offer(4);
        System.out.println(queue2);
        
        queue2.remove();
        System.out.println(queue2);
        
        queue2.poll();
        System.out.println(queue2);
        System.out.println("Peeking a number : "+queue2.peek());
        
        
        queue3.add(6.1);
        queue3.add(4.1);
        queue3.add(9.4);
        queue3.add(3.2);
        queue3.add(5.5);
        System.out.println(queue3);
        System.out.println(queue3.peek());
        
        queue3.remove();
        System.out.println(queue3.peek());
        
        queue3.remove();
        System.out.println(queue3.peek());
        System.out.println(queue3);
        

	}

}
