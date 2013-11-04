package genericStack;

//public class AImpl<T extends C> implements A<T> { /*Bound mismatch error*/ ... }
public class PointerStack<T extends Number> implements Stack<T> {
	
	private StackNode<T> head;
	
	public PointerStack() {
		head = null;
		
	}
 	
	@Override
	public void push(T newValue) {
		StackNode<T> newNode = new StackNode<T>(newValue);
		  if (head != null) {
			newNode.setNext(head);
		  }
		  head = newNode;	  
		
	}

	@Override
	public T pop() {
		if (head == null) {
			return (T) null;
		  }
		  T result = head.getValue();
		  head = head.getNext();
		  return result;
	}

	@Override
	public T peek() {
	  if (head == null) {
			return (T) null;
		  } else {
			return head.getValue();
		  }
	}

	@Override
	public boolean isEmpty() {
	  if (getSize() == 0) {
			return true;
		  } else {
			return false;
		  }
	}
	
    /**
     * Returns the number of integers in the stack
     */
    public int getSize() {
	  int result = 0;
	  StackNode<T> currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
	
	

}
