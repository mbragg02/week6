package hashTable;


/**
 * Create a generic simple map (with methods for putting a key–value pair, getting the value for a key, and removing a key). 
 * The key and the value may be any type, and they may be different. Each key can only be linked to one value. 
 * Use the TDD methodology (interface, test, production code, repeat. . . ).
 * For simplicity, assume that your map can hold a maximum of 1000 pairs. 
 * This way, you can use the hashing method you developed in past weeks and base your map on an array.
 */

public class SimpleMap<V> implements Map<V> {
	
	private Data<V>[] mapArray = new Data[1000];
		
	@Override
	public void put(int key, V[] value) {
		Data<V> newEntry = new Data<V>(key, value);
		mapArray[key] = newEntry;
		
	}

	@Override
	public V[] get(int key) {
		if(mapArray[key] != null) {
			return mapArray[key].value;
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		boolean isempty = true; 
		for (int i = 0; i < mapArray.length; i++) {
			if(mapArray[i] != null) {
				return false;
			}
		}
		return isempty;
	}

	@Override
	public void remove(int key) {	
		mapArray[key] = null;
	}

}
