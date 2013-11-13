/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

import java.util.Date;

/**
 *
 * @author Mo
 */
public class FirstIteration implements Runnable {
	 CirQueue<Customer> reservQ = new CirQueue<>();
	 Customer aCust = new Customer("Mo", 1 + "", "eric123", 2,
	            SeatCategories.SeatCat.WINDOWS, new Date());
	 public void setQueue(CirQueue<Customer> reservQ)
		{
			this.reservQ= reservQ;
		}
		public CirQueue<Customer> getQueue()
		{
			return reservQ;
		}
    @Override
    public void run() {
      
                int choice =0;
                int partysize =1;
                int count =0;
                int seat = 0;
                int anotherCust = 0;
                String name =" this guy";
           
            for( ; ; )
            {
              name = "Customer" + (count+1);
            
            partysize = (int)(Math.random()*6)+1;
            choice = (int)(Math.random()*3)+1;
                if(choice == 1)
               {
	  aCust = new Customer(name, count + "", name+ "123", 1,
	            SeatCategories.SeatCat.BAR_STOOL, new Date());
	  count= reservQ.size() * 5;
	  
               }
                   if(choice == 2)
              {
	  aCust = new Customer(name, count + "", name+ "123", partysize,
	            SeatCategories.SeatCat.WINDOWS, new Date());
	    count= reservQ.size() * 5;
              }
             if(choice == 3)
             {
	  aCust = new Customer(name, count + "", name+ "123", partysize,
	            SeatCategories.SeatCat.BOOTH, new Date());
          count= reservQ.size() * 5;
	     }
             
     seat=(int)(Math.random()*100)+1;
    anotherCust = (int)(Math.random()*100)+1;
    if(anotherCust <50)
    {
     Mainj.SimulatorOut.setText(" A Customer has joined the Reservation Queue");
    reservQ.offer(aCust);
    }
    if(seat <40 && !reservQ.isEmpty())
    {
        Mainj.SimulatorOut.setText(" A Customer has been seated from the Reservation Queue");
       reservQ.remove(aCust);
    }
      System.out.println(reservQ);
       String s = reservQ + "/n";
      // Mainj.QueueOut.setText(s);
      
            }
    }
    
    
}
