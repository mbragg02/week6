package hashTable;

public interface Map<V> {
	
	/*
	 * adds a new element to the map, associated with a key; depending on whether the key has already been used, 
	 * and whether the map allows more than one value per key, this method can return different types.
	 */
	void put(int key, V[] value);
	
	
	/*
	 * gets the value associated with that key.
	 */
	V[] get(int key);
	
	
	
	/*
	 * removes the value/key
	 */
	void remove(int key);
	
	
	/*
	 * Returns true if there are no elements on the stack, false otherwise.
	 */
	boolean isEmpty();

}
