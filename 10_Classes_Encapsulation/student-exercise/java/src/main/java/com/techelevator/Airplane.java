package com.techelevator;

public class Airplane {
	
	private String planeNumber;                        
	private int    bookedFirstClassSeats;               
	private int    totalFirstClassSeats;                 
	private int    bookedCoachSeats;                     
	private int    totalCoachSeats;
	
	public Airplane (String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
			this.planeNumber = planeNumber;
			this.totalFirstClassSeats = totalFirstClassSeats;
			this.totalCoachSeats = totalCoachSeats;
			
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
    //Find available Firstclass seat
	public int getAvailableFirstClassSeats() {
		int getAvailableFirstClassSeats = this.totalFirstClassSeats - this.bookedFirstClassSeats;
		return getAvailableFirstClassSeats;
	}
	//Find available CoachSeats
	public int getAvailableCoachSeats() {
		int getAvailableCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
		return getAvailableCoachSeats;
	}
	//Create reserve seat method
	public boolean  reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

		if(forFirstClass && totalNumberOfSeats <= this.getAvailableFirstClassSeats()) {
			bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeats;
			return true;			
		}else if(!forFirstClass && totalNumberOfSeats <= this.getAvailableCoachSeats()) {
			bookedCoachSeats = bookedCoachSeats + totalNumberOfSeats;
			return true;
		}
		return false;
	}
	
}
