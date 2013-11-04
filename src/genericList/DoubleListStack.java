package genericList;



public class DoubleListStack<T> implements Stack<T> {

	 private DoubleListNode<T> head;
	 
	 public DoubleListStack() {
		 head = null;
	 }
	
	@Override
	public void push(T newValue) {
		
		DoubleListNode<T> newNode = new DoubleListNode<T>(newValue);
		if (head == null) {
			head = newNode;
			return;
		}
		DoubleListNode<T> aux = head;
		
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		newNode.setPrevious((DoubleListNode<T>) aux);
		aux.setNext(newNode);	
		
	}

	@Override
	public T pop() {
	  if (head == null) {
			return (T) null;
		  }
		  T result = head.getItem();
		  head = head.getNext();
		  head.setPrevious(null);
		  return result;
		
	}

	@Override
	public T peek() {
		if (head == null) {
			return (T) null;
		  } else {
			return head.getItem();
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
	  DoubleListNode<T> currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
    
    
	public void prettyPrintForward() {
		System.out.println("------------------");
		System.out.println("Print forward");
		System.out.println("------------------");

		DoubleListNode<T> current = head;

		while(current != null) {
			if (current.getPrevious() != null ){
				System.out.println("Previous Patient: " + current.getPrevious().getItem());
			}
			System.out.println("Patient: " + current.getItem());
			
			if (current.getNext() != null ){
				System.out.println("Next Patient: " + current.getNext().getItem());
			}
			System.out.println("------------------");
			current = current.getNext();
		}
//		System.out.println("Number of Patients: " + patientListStart.size());
	}

}
