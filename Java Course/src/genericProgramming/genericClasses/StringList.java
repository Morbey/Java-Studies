package genericProgramming.genericClasses;

public class StringList<T> implements IList<T> {

	private T[] datastore;
	private int size;
	private int pos;
	
	public StringList(int numElements) {
		size = numElements;
		pos = 0;
		datastore = (T[]) new Object[size];
	}
	
	public void add(T element) {
		datastore[pos] = element;
		++pos;
	}
	
	public T get(int n) {
		return datastore[n];
	}
	
	public String toString() {
		String elements = "";
		for(int i=0; i<pos; ++i) {
			elements += datastore[i] + " ";
		}
		return elements;
	}
}

