package genericList;

public class DoubleListNode<T> {
	
	private DoubleListNode<T> next;
	private DoubleListNode<T> previous;
	private T item;
	
	public DoubleListNode(T item) {
		this.item = item;
		this.next = null;
		this.previous = null;
	}

	public T getItem() {
		return this.item;
	}

	public DoubleListNode<T> getNext() {
		return this.next;
	}

	public void setNext(DoubleListNode<T> object) {
		this.next = object;
		
	}

	public DoubleListNode<T> getPrevious() {
		return this.previous;
	}

	
	public void setPrevious(DoubleListNode<T> object) {
		this.previous = object;
		
	}

	

}
