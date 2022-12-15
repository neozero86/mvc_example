package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

public class Car extends Observable{
    private int x = 225;
    private int y = 220;
    private int width = 50;
    private int height = 100;
    private int VELOCITY = 2;
    
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

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
