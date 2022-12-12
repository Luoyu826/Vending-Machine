public class VendingMachine {
	
  Stockpile[] stocks;
 CoinBox depositbox;
 CoinBox changebox;
 BillBox billbox;
 
  
  /*
   * TODO: Define a constructor that initializes
   * the components of the vending machine.
   */
  public VendingMachine() {         
	  depositbox = new CoinBox();
	  changebox = new CoinBox();
	  billbox = new BillBox();
  }



  /*
   * TODO: Define a method that computes the amount of change to provide to users.
   * To provide the change, this method computes difference 
   * between the user deposit and the soda price.
   * Note that the vending machine provides as much change 
   * as it can to users even if the difference is not paid in full.
   * If the vending machine does not pay the difference in full, 
   * the change light sends a message to users.
   * Note that users receive the change from a change receiver.    
   * @param user deposit (in cents)
   * @param soda price (in cents)
   */ 
  public void change(int deposit, int price) {
	  int dif = deposit - price;
	  int qneed = dif/25;
	  if (depositbox.numq < qneed) {
		  changebox.setq(depositbox.numq);
		  depositbox.setq(0);
	  }
	  else {
		  changebox.setq(qneed);
		  depositbox.setq(depositbox.numq-qneed);
	  }
	  
	  int dneed = (dif-centchange())/10;
	  if (depositbox.numd < dneed) {
		  changebox.setd(depositbox.numd);
		  depositbox.setd(0);
	  }
	  else {
		  changebox.setd(dneed);
		  depositbox.setd(depositbox.numd-dneed);
	  }
			  
	  int nneed = (dif-centchange())/5;
	  if (depositbox.numn < nneed) {
		  changebox.setn(depositbox.numn);
		  depositbox.setn(0);
		  }
	  else {
		  changebox.setn(nneed);
		  depositbox.setn(depositbox.numn-nneed);
	  }
	  
	  int dif2 = dif-centchange();
	  if(dif2 > 0) {
		  System.out.println("There is not an enough change to make the difference.");
	  }
	  }
  
  //convert change to cents
  public int centchange() {
	  return changebox.numq*25 + changebox.numd*10 + changebox.numn*5;
  }
  
  //convert price of soda to cents
  public int centprice(Stockpile s) {
	  return (int)(s.getPrice() * 100);
  }
}
