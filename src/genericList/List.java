package genericList;

public interface List<T> {
	
	/*
     * Adds a new object onto the list
     */
    void add(T newValue);
    void add(DoubleListNode<T> object);
    
    /*
     * Removes an item from the list
     */
	void remove(DoubleListNode<T> object);
	
	


    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    T pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    T peek();


    
}
