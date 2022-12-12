package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

import model.Car;
import model.Direction;
import view.Window;

public class Controller implements KeyListener{

	private final Window window;
	private final Car car;
	
	public Controller(Car car, Window window) {
		this.window = window;
		this.car = car;
		car.addObserver(window.getCarView());
		window.addKeyListener(this);
		window.setVisible(true);
		//chronometer.addObserver(chronometerView);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
        Integer key = e.getKeyCode();
        switch (key) {
		case KeyEvent.VK_LEFT:
			car.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			car.move(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP:
			car.move(Direction.UP);
			break;
		case KeyEvent.VK_DOWN:
			car.move(Direction.DOWN);
			break;
		default:
			break;
		}     
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
