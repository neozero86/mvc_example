package model.directions;

import model.Movable;

public class Down extends Direction {

	@Override
	public void apply(Movable movable) {
		movable.increaseY();

	}

}
