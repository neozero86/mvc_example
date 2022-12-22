package model;

public abstract class Shape {
	protected int sidesQuantity;

	Shape(int sidesQuantity) {
		this.sidesQuantity = sidesQuantity;
	}
	
	public abstract int getArea(VisitorArea visitor);
}
