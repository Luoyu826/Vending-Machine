public class ChangeReceiver {

	/* 
	 *  TODO: Define a method that asks users
	 *  to take change from change receiver. 
	 *  @return A message for taking change from change receiver
	 */
	public static void takeChange(CoinBox changebox) {
		if (changebox.getq() == 1) {
		System.out.println("Take " + changebox.getq() + " quarter from change receiver.");
		}
		else if(changebox.getq() > 1) {
		System.out.println("Take " + changebox.getq() + " quarters from change receiver.");
		}
		
		if (changebox.getd() == 1) {
		System.out.println("Take " + changebox.getd() + " dime from change receiver.");
		}
		else if(changebox.getd() > 1) {
		System.out.println("Take " + changebox.getd() + " dimes from change receiver.");
		}
		
		if (changebox.getn() == 1) {
		System.out.println("Take " + changebox.getn() + " nickel from change receiver.");
		}
		else if(changebox.getn() > 1) {
		System.out.println("Take " + changebox.getn() + " nickels from change receiver.");
		}

	}
}       	
