package controller;

import java.util.concurrent.TimeUnit;

import model.Chronometer;
import view.ChronometerView;

public class Controller {

	private final Chronometer model;
	private final ChronometerView view;

	public Controller(Chronometer model, ChronometerView view) {
		this.model = model;
		this.view = view;
		view.setVisible(true);

	}
	
	public void run() throws InterruptedException {
		while (true) {
			model.update();		
			TimeUnit.SECONDS.sleep(1);
		}
	}

}
