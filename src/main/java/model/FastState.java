package model;

public class FastState extends State {
	private static final int SLEEP_FAST = 500;

	FastState(RandomGenerator generator) {
		super(generator);
		sleepyTime = SLEEP_FAST;
	}

	@Override
	public void increaseState() {
		generator.changeState(new SuperFastState(generator));

	}

}
