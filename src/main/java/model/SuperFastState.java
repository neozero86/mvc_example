package model;

public class SuperFastState extends State {
	private static final int SLEEP_SUPER_FAST = 250;

	SuperFastState(RandomGenerator generator) {
		super(generator);
		sleepyTime = SLEEP_SUPER_FAST;
	}

	@Override
	public void increaseState() {
		generator.changeState(new NormalState(generator));

	}

}
