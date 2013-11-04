package upcastingDowncasting;

public class StartScript {


	public static void main(String[] args) {
		StartScript launch = new StartScript();
		launch.laucher();
		
		
	}
	
	private void laucher() {
//		2.1 Start
		SmartPhone iPhone = new SmartPhone("Apple");
		
		iPhone.browseWeb("http://www.google.co.uk");
		iPhone.call("07787344535");
		iPhone.findPosition();
		iPhone.playGame("snake");
		
		
//		2.2 Direct Upcasting
		MobilePhone nokia = new SmartPhone("nokia");
		
		((SmartPhone) nokia).browseWeb("http://www.google.co.uk");
		nokia.call("07787344535");
		((SmartPhone) nokia).findPosition();
		((SmartPhone) nokia).playGame("snake");
		
		
//		2.3 Indirect upcasting when calling a method
//		testPhone(nokia);
		
//		2.5 Casting exception
		MobilePhone testMobile = new MobilePhone("sony");
		testPhone(testMobile);
		
	}
	
	private void testPhone(Phone myphone) {
		myphone.call("353534634634");
		// can only call methods from the original Phone interface.
		
//		2.4 Downcasting
//		((SmartPhone) myphone).browseWeb("http://www.google.co.uk");
		
		
//		((MobilePhone) myphone).ringAlarm("4636347");
		
	}

}
