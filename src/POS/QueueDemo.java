package POS;

import java.util.*;

public class QueueDemo {

        /**
         * @param args
         */
        /*public static void main(String[] args) {

                Random rand = new Random();
                int opentime = 9;
                int closetime = 21;
                int time = 9;
                int count = 0;
                int trafficPercent = 50;
                CirQueue<Customer> waitingQ = new CirQueue<Customer>();
                CirQueue<Customer> reservationQ = new CirQueue<Customer>();

                while ((time >= opentime) && (time <= closetime)) {
                        int cusArrival = rand.nextInt(100);
                        if (cusArrival <= trafficPercent) {
                                Customer aCust;
                                count++;
                                // reservation=0
                                if (rand.nextInt(2) == 1) {
                                        aCust = new Customer("Eric", count + "", "eric123", 5,
                                                        SeatCategories.SeatCat.WINDOWS, new Date());
                                        reservationQ.offer(aCust);
                                } else {
                                        // waiting list =1
                                        aCust = new Customer("Eric", count + "", "", 5,
                                                        SeatCategories.SeatCat.WINDOWS, new Date());
                                        waitingQ.offer(aCust);
                                }
                        }
                        time++;
                }
                
                System.out.println(reservationQ);
                System.out.println(waitingQ);
               /* Customer searchCust = new Customer("Eric", 1+ " " + " ", " ", 5,
                                SeatCategories.SeatCat.WINDOWS, new Date());
                System.out.println(reservationQ.contains(searchCust));
                System.out.println(waitingQ.contains(searchCust));
                */
               
                /*
                 * CirQueue<Integer> q = new CirQueue<Integer>(); q.offer(1);
                 * q.offer(2); q.offer(2); q.offer(3); System.out.println("before "
                 * +q.toString()); // System.out.println("After " +q.contains(2));
                 * q.remove(2); System.out.println("After " +q); q.remove(3);
                 * System.out.println("After " +q); q.remove(1);
                 * System.out.println("After " +q); q.remove(10); LinkedList alist = new
                 * LinkedList(); alist.add("A"); alist.add("B");
                 * System.out.println(alist.iterator().hasNext());
                 * System.out.println(alist.iterator().next());
                 * System.out.println((alist.iterator().next());
                 */
        

}