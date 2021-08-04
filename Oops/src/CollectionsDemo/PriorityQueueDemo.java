package CollectionsDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		
		// Create a Priority Queue - stored data in ascending order
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        
        //insert data uing offer()
        numbers.offer(80);
        numbers.offer(5000);
        
        System.out.println("Head Elements :"+numbers.peek());
        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

	}

}
