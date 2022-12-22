package model;

public class Triangle extends Shape{

	private static final int SIDES_QUANTITY = 3;
	private int minorLeg;
	private int mayorLeg;
	private int hypotenuse;
	private int height;


	Triangle(int height, int minorLeg, int mayorLeg, int hypotenuse) {
		super(SIDES_QUANTITY);
		this.height = height;
		this.minorLeg = minorLeg;
		this.mayorLeg = mayorLeg;
		this.hypotenuse = hypotenuse;
	}

	@Override
	public int getArea(VisitorArea visitor) {
		// TODO Auto-generated method stub
		return visitor.visitTriangle(this);
	}
	
	public int getMinorLeg() {
		return minorLeg;
	}

	public void setMinorLeg(int minorLeg) {
		this.minorLeg = minorLeg;
	}

	public int getMayorLeg() {
		return mayorLeg;
	}

	public void setMayorLeg(int mayorLeg) {
		this.mayorLeg = mayorLeg;
	}

	public int getHypotenuse() {
		return hypotenuse;
	}

	public void setHypotenuse(int hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static int getSidesQuantity() {
		return SIDES_QUANTITY;
	}

	
}
