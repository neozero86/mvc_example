package model;

public abstract class State {
	RandomGenerator generator;
	int sleepyTime;
	
    State(RandomGenerator generator) {
        this.generator = generator;
    }
    
	public abstract void increaseState();

	public int getSleepyTime() {
		return sleepyTime;
	}
}
