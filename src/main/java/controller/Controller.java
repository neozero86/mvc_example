package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import model.Car;
import model.Directions;
import view.Window;

public class Controller implements KeyListener{

	private final Window window;
	private final Car car;
	private Map<Integer,Directions> directions = new HashMap<Integer,Directions>();
	
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
		directions.put(KeyEvent.VK_LEFT, Directions.LEFT);
		directions.put(KeyEvent.VK_RIGHT, Directions.RIGHT);
		directions.put(KeyEvent.VK_UP, Directions.UP);
		directions.put(KeyEvent.VK_DOWN, Directions.DOWN);
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
