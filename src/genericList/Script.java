package genericList;



public class Script {
	

	public static void main(String[] args) {
		Script run = new Script();
		run.launch();
		

	}
	
	private void launch() {
		Stack<Integer> intList = new DoubleListStack<Integer>();
		Stack<String> stringList = new DoubleListStack<String>();
		intList.push(5);
		intList.push(6);
		intList.push(7);
		intList.push(8);
		System.out.println(intList.isEmpty());
		System.out.println(((DoubleListStack<Integer>) intList).getSize());
		
		stringList.push("hello");
		stringList.push("world");
		stringList.push("one");
		stringList.push("two");
		System.out.println(stringList.isEmpty());
		System.out.println(((DoubleListStack<String>) stringList).getSize());
		
		System.out.println(stringList.pop());
		
		((DoubleListStack<String>) stringList).prettyPrintForward();
		
		System.out.println(stringList.peek());
	}
	


}
