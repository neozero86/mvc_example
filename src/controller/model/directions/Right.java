package model.directions;

import model.Movable;

public class Right extends Direction {

	@Override
	public void apply(Movable movable) {
		movable.increaseX();
	}

}
