package model.speed;

public class FastestSpeed extends Speed {

	private static final int SPEED = 16;
	
	public FastestSpeed() {
		super(SPEED);
	}

	@Override
	public Speed increase() {
		return this;
	}

	@Override
	public Speed decrease() {
		return new CuadrupleSpeed();
	}

	public boolean isMax() {
		return true;
	}
}
