package model;

public class NormalState extends State {
	private static final int SLEEP_NORMAL = 1000;
	
	NormalState(RandomGenerator generator) {
		super(generator);
		sleepyTime = SLEEP_NORMAL;
	}
	
	public void increaseState() {
		generator.changeState(new FastState(generator));
	}
}
