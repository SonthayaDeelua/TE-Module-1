package com.techelevator;

public class Television {
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public Television() {
		this.isOn = false;
		this.currentChannel = 3;
		this.currentVolume = 2;				
	}

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	//Turn TV off
	public void turnOff() {
		this.isOn = false;
	}
	
	//turn TV on
	public void turnOn() {
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;	
	}
	
	//Change Channel
	public void changeChannel (int newChannel) {
		if (isOn && newChannel >4 && newChannel <=18) {
			this.currentChannel = newChannel;
		}
	}
	
	//Channel Up
	public void channelUp() {
		if(isOn) {
			this.currentChannel += 1;
			if(this.currentChannel > 18) {
				this.currentChannel = 3;
			}
			
		}
	}
	
	//Channel Down
	public void channelDown() {
		if(isOn) {
			if(currentChannel == 3 ) {
				currentChannel = 18;
			}else {
				currentChannel --;
			}
		}
		
	}

	//Raise Volume
	public void rasieVolume () {
		if (isOn && currentVolume < 10) {
			this.currentVolume += 1;
		}
		if(isOn && currentVolume >= 10) {
			this.getCurrentVolume();
		}
	}
	
	//Lower Volume
	public void lowerVolume () {
		if (isOn && currentVolume > 0) {
			this.currentVolume -=1;
		if(isOn && currentVolume <= 0)
			this.currentVolume = 0;
		}
	}
	

}
