package POS;

import java.util.Date;



public class Customer {
        private String name;
        private int waitingTime;
        private Date resArrivalTime;
        private String id;
        private String pw;
        private int partySize;
        private SeatCategories.SeatCat seatType;
        
        //reservation
        public Customer(String name, String id, String pw,
                        int partySize, SeatCategories.SeatCat seatType, Date resArrivalTime) {
                super();
                this.name = name;
                this.id = id;
                this.pw = pw;
                this.partySize = partySize;
                this.seatType = seatType;
                this.resArrivalTime = resArrivalTime;
        }
        
        public boolean equals(String id) {
                return this.id.equals(id);
        }
        
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public int getWaitingTime() {
                return waitingTime;
        }
        public void setWaitingTime(int waitingTime) {
                this.waitingTime = waitingTime;
        }
        public Date getresArrivalTime() {
                return resArrivalTime;
        }
        public void setresArrivalTime(Date resArrivalTime) {
                this.resArrivalTime = resArrivalTime;
        }
        public String getId() {
                return id;
        }
        public void setId(String id) {
                this.id = id;
        }
        public String getPw() {
                return pw;
        }
        public void setPw(String pw) {
                this.pw = pw;
        }
        public int getPartySize() {
                return partySize;
        }
        public void setPartySize(int partySize) {
                this.partySize = partySize;
        }
        public SeatCategories.SeatCat getSeatType() {
                return seatType;
        }
        public void setSeatType(SeatCategories.SeatCat seatType) {
                this.seatType = seatType;
        }

        @Override
        public String toString() {
                return "Customer [name=" + name + ", waitingTime=" + waitingTime
                                + ", resArrivalTime=" + resArrivalTime + ", id=" + id
                                + ", pw=" + pw + ", partySize=" + partySize + ", seatType="
                                + seatType + "]";
        }
        
        
}