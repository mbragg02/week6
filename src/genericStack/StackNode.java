package genericStack;

public class StackNode<T> {
	
	private T nodeValue;
	private StackNode<T> nextNode;
	
	public StackNode(T value) {
		this.nextNode = null;
		this.nodeValue = value;
	}
	
	public T getValue() {
		return this.nodeValue;
	}
	
	public void setNext(StackNode<T> newNode) {
		this.nextNode = newNode;
	}
	
	public StackNode<T> getNext() {
		return this.nextNode;
	}

}
