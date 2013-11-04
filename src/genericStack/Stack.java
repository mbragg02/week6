package genericStack;

public interface Stack<T> {

	/*
     * Adds a new object onto the stack
     */
    void push(T newValue);

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
    

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    boolean isEmpty();


    
}
