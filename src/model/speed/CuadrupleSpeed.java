package model.speed;

public class CuadrupleSpeed extends Speed {

	private static final int SPEED = 4;

	public CuadrupleSpeed() {
		super(SPEED);
	}

	@Override
	public Speed increase() {
		return new FastestSpeed();
	}

	@Override
	public Speed decrease() {
		return new DoubleSpeed();
	}

}
