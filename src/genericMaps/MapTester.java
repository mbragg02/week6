package genericMaps;


public class MapTester {

	
	public static void main(String[] args) {
		MapTester run = new MapTester();
		run.launch();
	}
	
	private void launch() {
		Map<String> stringMap = new SimpleMap<String>();
		String value = "hello";
		stringMap.put(hash(value), value);
		System.out.println(stringMap.get(hash(value)));
		System.out.println("Is the map empty? : " + stringMap.isEmpty());
		
		Map<Double> doubleMap = new SimpleMap<Double>();
		Double value1 = 6.5;
		doubleMap.put(hash(value1), value1);
		System.out.println(doubleMap.get(hash(value1)));
		System.out.println("Is the map empty? : " + doubleMap.isEmpty());
		
		Map<Integer> integerMap = new SimpleMap<Integer>();
		int value2 = 876;
		integerMap.put(hash(value2), value2);
		int value3 = 24;
		integerMap.put(hash(value3), value3);
		integerMap.remove(hash(value3));
		System.out.println(integerMap.get(hash(value3)));
		System.out.println("Is the map empty? : " + integerMap.isEmpty());
		
		
		
	}
	
	static int hash(String value) {		
		int hash = value.hashCode();
		hash = Math.abs(hash);
		hash = hash % 999;
		return hash;
	}
	 int hash(Double value) {
		return hash(value + "");
	}
	 int hash(int value) {
		return hash(value + "");
		
	}
	

}
