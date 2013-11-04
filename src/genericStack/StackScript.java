package genericStack;

public class StackScript {


	public static void main(String[] args) {
		StackScript run = new StackScript();
		run.launch();

	}
	
	private void launch() {
		Stack<Integer> intStack = new PointerStack<Integer>();
		intStack.push(5);
		intStack.push(10);
		System.out.println(intStack.peek());
		
	}

}
