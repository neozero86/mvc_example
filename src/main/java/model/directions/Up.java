package model.directions;

import model.Movable;

public class Up extends Direction {

	@Override
	public void apply(Movable movable) {
		movable.decreaseY();

	}

}
