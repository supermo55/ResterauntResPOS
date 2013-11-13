package POS;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer aCust =  new Customer("Eric", 1 + "", "eric123", 5,
	            SeatCategories.SeatCat.WINDOWS, new Date());
    	
		System.out.println(aCust.getresArrivalTime().compareTo(new Date("Mon Nov 11 11:14:50 EST 2013")));
	}

}
