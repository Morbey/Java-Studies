package sequencialCollections;

import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {
		PriorityQueue<String> line = new PriorityQueue<String>();
		line.add("David");
		line.add("Cynthia");
		line.add("Raymond");
		line.add("Bryan");
		line.add("Clayton");
		
		System.out.println("The line: ");
		for (String name : line) {
			System.out.println(name);
		}
		line.poll(); //Remove First
		System.out.println();
		System.out.println("The line: ");
		for (String name : line) {
			System.out.println(name);
		}
		
		line.remove("Raymond"); //Remove item
		System.out.println("The line: ");
		for (String name : line) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("The head: " + line.peek());
	}
}
