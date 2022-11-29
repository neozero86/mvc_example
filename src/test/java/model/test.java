package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class test {
	
	@Test
	public void testFuncionando(){
		RandomGenerator randomGenerator = new RandomGenerator();
		FastState fastState = new FastState(randomGenerator);
		assertNotNull(fastState.getSleepyTime());
	}
	
	@Test
	public void testFallando(){
		RandomGenerator randomGenerator = new RandomGenerator();
		FastState fastState = new FastState(randomGenerator);
		assertNull(fastState.getSleepyTime());
	}
}