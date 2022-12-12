package model.speed;

import model.Chronometer;

public class NormalSpeed extends Speed {

	private static int SPEED = 1;
	
	public NormalSpeed() {
		super(SPEED);
	}
	
	@Override
	public Speed increase() {
		return new DoubleSpeed();
	}

	@Override
	public Speed decrease() {
		return this;
	}

	public boolean isMin() {
		return true;
	}
}
