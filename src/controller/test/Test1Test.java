package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import model.Car;
import model.Directions;

public class Test1Test {
	@Test
	public void testFuncionando(){
		Car car = new Car();
		assertNotNull(car);
		assertEquals(220, car.getY());
		car.move(Directions.DOWN);
		assertEquals(222, car.getY());
	}

	@Test
	public void testFallando(){
		Car car = new Car();
		assertNull(car);
		assertEquals(220, car.getY());
		car.move(Directions.DOWN);
		assertEquals(222, car.getY());
	}
}
