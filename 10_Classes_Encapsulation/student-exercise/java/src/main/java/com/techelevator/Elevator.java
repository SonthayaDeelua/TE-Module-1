package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOfFloors) {
		super();
		this.numberOfFloors = totalNumberOfFloors;
		this.currentFloor = 1;
		this.doorOpen = false;	
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	// Open the door
	public void openDoor() {
		doorOpen = true;
	}

	// Close the door
	public void closeDoor() {
		doorOpen = false;
	}
	
	//Going Up
	public void goUp(int desiredFloor) {
		if(doorOpen == false) {
			if(currentFloor < numberOfFloors) {
				currentFloor = desiredFloor;
			}
		}
	}
	
	//Going down
	public void goDown(int desiredFloor) {
		if (doorOpen == false) {
			if(currentFloor > 1) {
				currentFloor = desiredFloor;
			}
		}
	}
	
	
	
}
