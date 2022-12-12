public class Stockpile {
	
        /*
         * Declare fields that count sodas and specify
         * the price and ID of sodas.
         */
	int num;
	double price;
	int id;
	
    
	/*
	 * TODO: Define a three-parameter constructor that
	 * initializes information about sodas as mentioned above. 
	 */
	public Stockpile(int num, double price, int id) {
		this.num = num;
		this.price = price;
		this.id = id;
	}
	
	/*
	 *  TODO: Define a method that updates the available 
	 *  number of sodas after a successful purchase.
	 */
	public void numUpdate(){
			num--;
		}

	/* 
	 *  TODO: Define a method that indicates whether stockpile 
	 *  runs out of soda.
	 *  @return Whether or not stockpile runs out of soda 
	 */
	public Boolean isEmpty() {
		if (num == 0) {
			return true;
		}
		return false;
	}
	
	/*
	 * TODO: Define a method that provides the price of soda.
	 * @return The price of soda
	 */	
	public double getPrice() {
		return price;
	}

	/*
	 * TODO: Define a method that provides the ID of soda.
	 * @return The ID of soda
	 */	
	public int getID() {
		return id;
	}
}
