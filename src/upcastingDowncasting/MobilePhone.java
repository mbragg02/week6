package upcastingDowncasting;

import java.util.ArrayList;

public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand) {
		super(brand);
	}

	private ArrayList<String> lastTenNumbers = new ArrayList<String>();
	
	public void ringAlarm(String number) {
		System.out.println("Ringing alarm " + number);
	}
	
//	private void playGame(String number) {
//		System.out.println("Play game " + number);
//	}
	
	public void printLastNumbers() {
		System.out.println("Your last 10 calls where: ");

		for(int i = 0; i < lastTenNumbers.size() - 1; i ++) {
			System.out.println((i + 1) + ": " + lastTenNumbers.get(i));
		}
		
	}
	
	public void call(String number) {
		super.call(number);
		addToCallHistory(number);	
	}
	
	public void addToCallHistory(String number) {
		if (lastTenNumbers.size() <= 10) {
			lastTenNumbers.add(0, number);
		} else {
			lastTenNumbers.remove(lastTenNumbers.size() - 1);
			lastTenNumbers.add(0, number);
						
		}
	}

}
