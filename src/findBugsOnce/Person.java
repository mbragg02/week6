package findBugsOnce;

public class Person {
	
	public String getInitials(String fullName) { 
		String result = "";
		
		// added to remove leading and trailing whitespace.
		fullName = fullName.trim();
		
//		String[] words = fullName.split(" ");
		// added regular expression to account for multiple whitespace between words.
		String[] words = fullName.split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].trim().charAt(0);
			result = result + nextInitial.toUpperCase(); 
		}
		return result;
	  }
	 

}
