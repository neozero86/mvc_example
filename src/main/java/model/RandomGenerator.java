package model;

import java.util.Observable;

public class RandomGenerator extends Observable {

	private boolean activate = false;
	private int time = 0;

	public void update() {
		if (activate) {
			time ++;
		}
		updated();
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
}
