package controller;

import java.util.concurrent.TimeUnit;

import model.Chronometer;
import view.ChronometerView;

public class Controller {

	private final Chronometer chronometer;
	private final ChronometerView chronometerView;
	
	public Controller(Chronometer model, ChronometerView view) {
		chronometer = model;
		chronometerView = view;
		chronometerView.setVisible(true);
		chronometer.addObserver(chronometerView);
	}

	void run() throws InterruptedException {

		while (true) {
			chronometer.update();
			TimeUnit.MILLISECONDS.sleep(chronometer.getDelay());
		}
		
	}
}
