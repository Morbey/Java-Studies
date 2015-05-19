package genericProgramming.genericMethods;

public class LinkedList {

	public static void main(String[] args) {
		Node<String> node1 = new Node<String>("David");
		Node<String> node2 = new Node<String>("Raymond");
		
		Node<String> node3 = new Node<String>("Cynthia");
		
		node1.next = node2;
		node2.next = node3;
		Node<String> footer = new Node<String>("Footer");
		node3.next = footer;
		Node<String> dummy;
		dummy = node1;
		
		while(dummy.next != null) {
			System.out.println(dummy.getData());
			dummy = dummy.next;
		}
	}
}
