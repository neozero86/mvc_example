package model.speed;

public class DoubleSpeed extends Speed {

	private static final int SPEED = 2;

	public DoubleSpeed() {
		super(SPEED);
	}

	@Override
	public Speed increase() {
		return new CuadrupleSpeed();
	}

	@Override
	public Speed decrease() {
		return new NormalSpeed();
	}

}
