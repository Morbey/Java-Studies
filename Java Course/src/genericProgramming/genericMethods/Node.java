package genericProgramming.genericMethods;

public class Node<T> {
	
	private T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data;
		next = null;
	}
	
	T getData() {
		return data;
	}
}
