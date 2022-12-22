package model;

public class Square extends Shape{
	private static final int SIDES_QUANTITY = 4;
	private int sidesSize;	
	
	Square(int sidesSize) {
		super(SIDES_QUANTITY);
		this.sidesSize = sidesSize;
	}

	@Override
	public int getArea(VisitorArea visitor) {
		return visitor.visitSquare(this);
	}


	public int getSidesSize() {
		return sidesSize;
	}


	public void setSidesSize(int sidesSize) {
		this.sidesSize = sidesSize;
	}


	public static int getSidesQuantity() {
		return SIDES_QUANTITY;
	}

}
