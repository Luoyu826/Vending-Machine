public class BillBox {

	/* 
	 * TODO: Define a field that counts the deposited bills. 
	 */
	int numBills;
	
       /*
        * TODO: Define a zero-parameter constructor 
        * for initializing the deposited bills.
        */
	public BillBox() {
		numBills = 0;
	}
	
	/*
	 *  TODO: Define a method that increments
	 *  the deposited bills
	 */
    public void inc() {
    	numBills ++;
    }
		
	/* 
	 * TODO: Define a method that resets the deposited bills.  
	 */
	public void resetBills() {
		numBills = 0;
	}

	/*
	 * TODO: Define a method that returns the deposited bills
	 * @return the deposited bills 
	 */
	public int getBills() {
		return numBills;
	}
}
