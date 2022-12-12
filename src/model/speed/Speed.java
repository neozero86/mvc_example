package model.speed;

import model.Chronometer;

public abstract class Speed {
	
	private int speed;

	public Speed(int speed) {
		this.speed = speed;
	}

	public abstract Speed increase();
	public abstract Speed decrease();

	public int getSpeed() {
		return speed;
	}
	
	public boolean isMax() {
		return false;
	}
	
	public boolean isMin() {
		return false;
	}
	
}
