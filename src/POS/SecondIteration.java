/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POS;

import java.util.Date;
import POS.FirstIteration;
/**
 * 
 * @author Mo
 */
public class SecondIteration implements Runnable {

	private Runnable reservation;
	CirQueue<Customer> waitQ = new CirQueue<>();
	Customer aCust = new Customer("Mo", 1 + "", "eric123", 2,
			SeatCategories.SeatCat.WINDOWS, new Date());
	public SecondIteration(Runnable reservation) {
		this.reservation = reservation;
	}

	@Override
	public void run() {
		int choice = 0;
		int partysize = 1;
		int count = 0;
		int seat = 0;
		int anotherCust = 0;
		String name = " this guy";
		Customer aCust = new Customer(name, count + "", "eric123", partysize,
				SeatCategories.SeatCat.WINDOWS, new Date());
		for (;;) {
			name = "Customer" + (count + 1);

			partysize = (int) (Math.random() * 6) + 1;
			choice = (int) (Math.random() * 3) + 1;
			if (choice == 1) {
				aCust = new Customer(name, count + "", name + "123", 1,
						SeatCategories.SeatCat.BAR_STOOL, new Date());
				count = waitQ.size() * 5;

			}
			if (choice == 2) {
				aCust = new Customer(name, count + "", name + "123", partysize,
						SeatCategories.SeatCat.WINDOWS, new Date());
				count = waitQ.size() * 5;
			}
			if (choice == 3) {
				aCust = new Customer(name, count + "", name + "123", partysize,
						SeatCategories.SeatCat.BOOTH, new Date());
				count = waitQ.size() * 5;
			}

			seat = (int) (Math.random() * 100) + 1;
			anotherCust = (int) (Math.random() * 100) + 1;
			if (anotherCust < 10) {
				Mainj.SimulatorOut
						.setText(" A Customer has joined the Waiting Queue");
				waitQ.offer(aCust);
			}

			if (seat < 10 && !waitQ.isEmpty() && checkTime() == true) {
				Mainj.SimulatorOut
						.setText(" A Customer has been seated from the Waiting Queue since the Seat was not reserved at the time");
				waitQ.remove(aCust);
			}
			System.out.println(waitQ);
			//String s = waitQ + "/n";
			// Mainj.QueueOut.setText(s);

		}
	}
	
	//check the reservation list for the same time
	private boolean checkTime()
	{
		
		//
	if(waitQ.peek().getresArrivalTime()== ((FirstIteration)reservation).getQueue().peek().getresArrivalTime())
	{
		return false;
	}
		return true;
		
	}
	
}
