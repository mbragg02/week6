package genericList;


public class DoubleList<T> implements List<T> {

	 private DoubleListNode<T> first;
	 
	 public DoubleList() {
		 first = null;
	 }
	
	@Override
	public void add(T newValue) {
		
		DoubleListNode<T> newNode = new DoubleListNode<T>(newValue);
		if (first == null) {
			first = newNode;
			return;
		}
		DoubleListNode<T> aux = first;
		
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		newNode.setPrevious((DoubleListNode<T>) aux);
		aux.setNext(newNode);	
		
	}
	
	@Override
	public void remove(DoubleListNode<T> x) {
		if (first == null) {
			return;
		}
		
		DoubleListNode<T> aux = first;
		
		while(aux.getNext() != null) {
			
			if (aux.getItem().equals(x.getItem())) {
			aux.getPrevious().setNext(x.getNext());
			aux.getNext().setPrevious(x.getPrevious());
				
			}
			aux = aux.getNext();
		}
		
	}

	@Override
	public T pop() {
	  if (first == null) {
			return (T) null;
		  }
		  T result = first.getItem();
		  first = first.getNext();
		  first.setPrevious(null);
		  return result;
		
	}

	@Override
	public T peek() {
		if (first == null) {
			return (T) null;
		  } else {
			return first.getItem();
		  }

	}


	
    /**
     * Returns the number of integers in the stack
     */
    public int getSize() {
	  int result = 0;
	  DoubleListNode<T> currentNode = first;
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

		DoubleListNode<T> current = first;

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
