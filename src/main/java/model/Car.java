package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

import model.directions.Direction;

public class Car extends Observable implements Movable{
    private Integer x = 225;
    private Integer y = 220;
    private Integer width = 50;
    private Integer height = 100;
    private Integer MOVIMENT_UNIT = 2;
    
	public void move(Direction direction) {
        direction.apply(this);
	}
	
	@Override
	public void increaseX() {
        x = x + MOVIMENT_UNIT;
        updated();
	}


	@Override
	public void decreaseY() {
        y = y - MOVIMENT_UNIT;
        updated();
	}


	@Override
	public void increaseY() {
        y = y + MOVIMENT_UNIT;
        updated();
	}


	public void decreaseX() {
        x = x - MOVIMENT_UNIT;
        updated();
	}
	
	private void updated() {
		setChanged();
		notifyObservers();		
	}

	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}

	public Integer getWidth() {
		return width;
	}

	public Integer getHeight() {
		return height;
	}

}
