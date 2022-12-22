package model.directions;

import model.Movable;

public class Left extends Direction {

	@Override
	public void apply(Movable movable) {
		movable.decreaseX();
	}

}
