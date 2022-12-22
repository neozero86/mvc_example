package model;

public interface Visitor {
	public int visitSquare(Square square);
	public int visitTriangle(Triangle triangle);
	public int visitDot(Dot dot);

}
