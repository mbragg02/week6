package genericList;



public class Script {
	

	public static void main(String[] args) {
		Script run = new Script();
		run.launch();
		

	}
	
	private void launch() {
		List<Integer> intList = new DoubleList<Integer>();
		List<String> stringList = new DoubleList<String>();
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		System.out.println(((DoubleList<Integer>) intList).getSize());
		
		stringList.add("hello");
		stringList.add("world");
		stringList.add("one");
		stringList.add("two");
		System.out.println(((DoubleList<String>) stringList).getSize());
		
		((DoubleList<String>) stringList).prettyPrintForward();

		
		System.out.println(stringList.pop());
		((DoubleList<String>) stringList).prettyPrintForward();

		
		System.out.println(stringList.peek());
		
//		stringList.remove(object)
	}
	


}
