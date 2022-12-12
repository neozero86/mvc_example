package model;

import java.util.Observable;

import model.speed.NormalSpeed;
import model.speed.Speed;

import static model.Constants.*;

public class Chronometer extends Observable {

	private int counter = 0;
	private boolean active = false;
	private Speed speed = new NormalSpeed();
	
	public void speedUp() {
		speed = speed.increase();
		updated();	
	}
	
	public void speedDown() {
		speed = speed.decrease();
		updated();
	}
	
	public int getDelay() {
		return ONE_SECOND / speed.getSpeed();
	}
	
	public void update() {
		if (active) {
			counter++;
		}
		updated();
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public int getCounter() {
		return counter;
	}
	
	public void resetCounter() {
		counter = 0;
	}
	
	private void updated() {
		setChanged();
		notifyObservers();
	}

	public int getSpeed() {
		return speed.getSpeed();
	}

	public boolean isMaxLimitReached() {
		return speed.isMax();
	}
	
	public boolean isMinLimitReached() {
		return speed.isMin();
	}
}
