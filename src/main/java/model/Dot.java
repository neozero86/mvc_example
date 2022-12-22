package model;

public class Dot extends Shape {
	private static final int SIDES_QUANTITY = 0;
	private int size;
	
	Dot(int size) {
		super(SIDES_QUANTITY);
		this.setSize(size);
	}

	@Override
	public int getArea(VisitorArea visitor) {
		// TODO Auto-generated method stub
		return visitor.visitDot(this);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
