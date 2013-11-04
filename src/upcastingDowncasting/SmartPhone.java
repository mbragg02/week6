package upcastingDowncasting;

public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);
	}

	public void browseWeb(String webAddress) {
		System.out.println("Browsing: " + webAddress);
	}
	
	public void findPosition() {
		System.out.println("Your position: Birkbeck University");
	}
	
	public void playGame(String number) {
		System.out.println("Play game " + number);
	}
	
	
	@Override
	public void call(String number) {
		String numberStart = number.substring(0, 2);
		if (numberStart.equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money!");
			super.addToCallHistory(number);
		} else {
			super.call(number);
		}
		

		 
		
	}
	
	

}
