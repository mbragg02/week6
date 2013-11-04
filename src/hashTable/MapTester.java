package hashTable;


public class MapTester {

	
	public static void main(String[] args) {
		MapTester run = new MapTester();
		run.launch();
	}
	
	private void launch() {
		Map<String> stringArrayMap = new SimpleMap<String>();

		String[] multipleStrings = {"hello", "world", "happy", "birthday"};
		stringArrayMap.put(hash(multipleStrings), multipleStrings);
		String [] resultArray = stringArrayMap.get(hash(multipleStrings));
		String result = "";
		result += "{";
		for (int i = 0; i < resultArray.length; i ++ ) {
			result += resultArray[i];
			if(i != resultArray.length - 1 ) {
				result += ", ";
			}
			
		}
		result += "}";
		System.out.println(result);
		
		System.out.println("Is the map empty? : " + stringArrayMap.isEmpty());
		
//		Map<Double> doubleMap = new SimpleMap<Double>();
//		Double value1 = 6.5;
//		doubleMap.put(hash(value1), value1);
//		System.out.println(doubleMap.get(hash(value1)));
//		System.out.println("Is the map empty? : " + doubleMap.isEmpty());
//		
//		Map<Integer> integerMap = new SimpleMap<Integer>();
//		int value2 = 876;
//		integerMap.put(hash(value2), value2);
//		int value3 = 24;
//		integerMap.put(hash(value3), value3);
//		integerMap.remove(hash(value3));
//		System.out.println(integerMap.get(hash(value3)));
//		System.out.println("Is the map empty? : " + integerMap.isEmpty());
		
		
		
	}
	

	
	private int hash(String value) {		
		int hash = value.hashCode();
		hash = Math.abs(hash);
		hash = hash % 999;
		return hash;
	}
	private int hash(Double value) {
		return hash(value + "");
	}
	private int hash(int value) {
		return hash(value + "");
		
	}
	private int hash(String[] values) {
		String result = null;
		for (int i = 0; i < values.length; i ++) {
			result += values[i];
		}
		return hash(result);
		
	}
	

}
