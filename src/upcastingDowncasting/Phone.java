package upcastingDowncasting;

/**
 * A phone makes calls
 *
 */
public interface Phone { 
	
	/**
	 * Just print on the screen: "Calling <number>...".
	 * @param String number. The number to call.
	 */
	void call(String number);
}