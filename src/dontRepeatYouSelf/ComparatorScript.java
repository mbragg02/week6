package dontRepeatYouSelf;

public class ComparatorScript {


	public static void main(String[] args) {
		
		Comparator script = new Comparator();
		int a = script.getMax(5, 10);
		
		double b = script.getMax(4.6, 3.2);
		
		String c = script.getMax("2", "6");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		

	}

}
