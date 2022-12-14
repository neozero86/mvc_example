package model;

import java.util.Observable;

public class RandomGenerator extends Observable {

	private boolean activate = false;
	private int time = 0;
	private State state = new NormalState(this);

	public void update() {
		if (activate) {
			time ++;
		}
		updated();
	}

	public int getSleepyTime() {
		return state.getSleepyTime();
	}
	
	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public String getTime() {
		return Integer.toString(time);
	}

	private void updated() {
		setChanged();
		notifyObservers();
	}

	public void resetCounter() {
		time = 0;
	}

	public void incrementVelocity() {
		state.increaseState();
	}

	public void changeState(State state) {
		this.state  = state; 
		
	}
}
