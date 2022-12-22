package model;

public class VisitorArea implements Visitor{
	
	@Override
	public int visitSquare(Square square) {
		return square.getSidesSize()*square.getSidesSize();
	}

	@Override
	public int visitTriangle(Triangle triangle) {
		return triangle.getHypotenuse() * triangle.getHeight() / 2;
		
	}

	@Override
	public int visitDot(Dot dot) {
		return dot.getSize();		
	}
}
