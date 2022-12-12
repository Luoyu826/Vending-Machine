import java.util.Scanner;



public class VendingMachineTester {
	public static void main(String[] args) {
	  int numStockpiles;
		
	  /*
	   * TODO: Ask user to enter the number of brands (stockpiles) of soda
	   */
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of stockpiles: ");
       numStockpiles = Integer.parseInt(sc.nextLine());
	   Stockpile[ ] stockpileArray = new Stockpile[numStockpiles];        
		
	   /*
	    * TODO: In each iteration, ask user to enter information
	    * about a stockpile. The information are stored in the
	    * variables shown below. 
	    * Note that the user enters the price of soda in dollars 
	    * and cents e.g., 2.50 (2 dollars and 50 cents).  
	    */
	   int numberOfSoda;
	   double priceOfSoda;
	   int sodaID;
	   for(int i = 0; i < numStockpiles; i++) {
	     System.out.print("Enter the number of sodas: ");
	     numberOfSoda = Integer.parseInt(sc.nextLine());
	     System.out.print("Enter the price of soda: ");        
	     priceOfSoda = Double.parseDouble(sc.nextLine());
	     System.out.print("Enter the ID of soda: ");        
	     sodaID = Integer.parseInt(sc.nextLine());      
	     Stockpile sp = new Stockpile(numberOfSoda, priceOfSoda, sodaID);
	     stockpileArray[i] = sp;
	   }

		/*
		 * TODO: Create a vending machine using the components listed
		 * in the description of the assignment. 
		 */
	   VendingMachine soda = new VendingMachine();
	   
            		
	   while(true) {
          /*
           * TODO: Ask user if they want to purchase sodas.
           * If they do, then ask user to enter the ID of a desired 
	   * stockpile, which will be stored in id shown below.
           * The program terminates if user decides not to
           * purchase sodas. 	
           */
          int id;
          System.out.print("Do you want to purchase soda? ");
          Scanner sc2 = new Scanner(System.in);
          String response = sc2.nextLine();
          if(response.equals("yes")) {  
           System.out.print("Enter the ID of stockpile: ");
           id = Integer.parseInt(sc2.nextLine());
           
           /*
            * TODO: Search through stockpiles to find
            * a stockpile whose ID matches the  
            * one that the user entered above. That 
            * stockpile will be stored in sp. 
            */
           Stockpile sp = null;
           for (int i=0; i<numStockpiles; i++) {
        	   if (stockpileArray[i].getID() == id) {
        		   sp = stockpileArray[i];//store that soda in sp
        	   }
           }
                                 
           /*
            * TODO: Check if the stockpile has not run out of sodas.
            * If not, keep asking users to deposit one-dollar bill 
	    * or a coin type as long as the deposited money is less than the 
	    * price of soda.
            * If users deposit more than the price of the soda, the
            * vending machine makes change.
            * If a purchase is successful, the vending machine displays a message 
	    * to users and ask them to take soda from beverage receiver. Otherwise, 
	    * it reports to users that a stockpile runs out of soda.
            */
           if(!sp.isEmpty() ) {
        	   //System.out.println(sp.num);
        	int paid = 0;
        	while(paid < soda.centprice(sp)) {        	  
        	  System.out.println("Do you insert bill, quarter, dime, or nickel?");
              response = sc2.next();
              
              if(response.equals("bill")) {
                soda.billbox.inc();
                paid += 100;
              } else if(response.equals("quarter")) {
                soda.depositbox.addq();
                paid += 25;
              } else if(response.equals("dime")) {
                soda.depositbox.addd();
                paid += 10;
              } else if(response.equals("nickel")) {
                soda.depositbox.addn();
                paid += 5;
              }
        	  
         	  
         	  /*
         	   * TODO: obtain the current deposited money. This
         	   * will be compared to the price of soda above.
         	   */          	  
                                     	          	   
           }
        	soda.change(paid, soda.centprice(sp));
        	//System.out.println(soda.depositbox.numq);
        	//System.out.println(soda.depositbox.numd);
        	//System.out.println(soda.depositbox.numn);
        	//System.out.println(soda.changebox.numq);
        	//System.out.println(soda.changebox.numd);
        	//System.out.println(soda.changebox.numn);
        	ChangeReceiver.takeChange(soda.changebox);
        	Display.purchased();//deposit more than the price, successfully purchased
        	BeverageReceiver.takeSoda();//take the soda after purchase
        	sp.numUpdate();
	   } 
           else {
                Display.noSoda();//run out of soda
           }
          }
          else {
        	  break;//said "no"
          }
        }
   }
}
