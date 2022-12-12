package controller;

import model.Car;
import view.Window;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		Window window = new Window(car);
		Controller controller = new Controller(car, window);
	}
}
