package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import model.Car;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;
import view.Window;

public class Controller implements KeyListener{

	private final Window window;
	private final Car car;
	private Map<Integer,Direction> directions = new HashMap<Integer,Direction>();
	
	public Controller(Car car, Window window) {
		fillDirections();
		this.window = window;
		this.car = car;
		car.addObserver(window.getCarView());
		window.addKeyListener(this);
		window.setVisible(true);
		//chronometer.addObserver(chronometerView);
	}

	private void fillDirections() {
		directions.put(KeyEvent.VK_LEFT, new Left());
		directions.put(KeyEvent.VK_RIGHT, new Right());
		directions.put(KeyEvent.VK_UP, new Up());
		directions.put(KeyEvent.VK_DOWN, new Down());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        if (directions.containsKey(key)) {
            car.move(directions.get(key));
        } 	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
