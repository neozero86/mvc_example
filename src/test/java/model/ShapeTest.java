package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void getTriangleArea() {
		VisitorArea visitor = new VisitorArea();
		Triangle triangle = new Triangle(2,3,4,5);
		assertEquals(5, triangle.getArea(visitor));
	}
}
