public class CoinBox {
 /*
  * TODO: Define fields that count the deposited coins.	
  */
  int numq;
  int numd;
  int numn;

  /*
   * TODO: Define a zero-parameter constructor 
   * that initializes the deposited coins.
   */    
  public CoinBox() {
	  numq = 0;
	  numd = 0;
	  numn = 0;
  }
  
  /*
   * TODO: Define methods for depositing coins.
   * Define a separate method for each coin type. 
   */
  public void addq() {
	  numq ++;
  }
  public void addd() {
	  numd ++;
  }
  public void addn() {
	  numn ++;
  }
  
  /*
   * TODO: Define methods for returning the deposited
   * coins. Define a separate method for each coin type.
   * @return deposited coins of a particular type
   */  
  public int getq() {
	  return numq;
  }
  public int getd() {
	  return numd;
  }
  public int getn() {
	  return numn;
  }

  /*
   * TODO: Define, for each coin type, a method that 
   * sets a new value for that coin type.
   * @param The new number of coins for a given coin type
   */  
  public void setq(int a) {
	  numq = a;
  }
  public void setd(int a) {
	  numd = a;
  }
  public void setn(int a) {
	  numn = a;
  }
 
  /*
   * TODO: Define a method for transferring coins from a
   * coin box to another coin box.
   * Note that one of the coin boxes receives the deposited coins 
   * from users. The other coin box provides change to users.
   * @param A coin box that provides change to users.
   * transfer all coins from deposit box to change box, and then empty the deposit box 
   */ 
  public void transfer(CoinBox changebox, int q, int d, int n) {
	  changebox.numq += q;
	  this.numq -= q;
	  changebox.numd += d;
	  this.numd -= d;
	  changebox.numn += n;
	  this.numn -= n;
  }
}
