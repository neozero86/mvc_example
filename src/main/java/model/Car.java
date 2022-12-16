package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

public class Car extends Observable{
    private Integer x = 225;
    private Integer y = 220;
    private Integer width = 50;
    private Integer height = 100;
    private Integer VELOCITY = 2;
    
	public void move(Directions direction) {
		switch (direction) {
		case LEFT:
	        x = x - VELOCITY;
			break;
		case UP:
	        y = y - VELOCITY;
			break;
		case RIGHT:
	        x = x + VELOCITY;
			break;
		case DOWN:
	        y = y + VELOCITY;
			break;

		default:
			break;
		}
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
